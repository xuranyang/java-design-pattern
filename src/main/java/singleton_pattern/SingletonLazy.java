package singleton_pattern;

/**
 * 懒汉式单例模式-DCL双重校验锁
 * 延迟加载 线程安全
 * SingletonLazy instance = SingletonLazy.getInstance();
 * <p>
 * <p>
 * 使用 volatile 的原因:
 * https://www.cnblogs.com/zhongqifeng/p/14684028.html
 * https://blog.csdn.net/qq_43521665/article/details/118200060
 * 因为有指令重排序的存在，双端检索机制也不一定是线程安全的。
 * 因为instance = new Singleton(); 初始化对象的过程其实并不是一个原子的操作，它会分为三部分执行：
 * 1.给 instance 分配内存
 * 2.调用 instance 的构造函数来初始化对象
 * 3.将 instance 对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
 * 步骤 2 和 3 不存在数据依赖关系，如果虚拟机存在指令重排序优化，则步骤 2和 3 的顺序是无法确定的。
 * 如果A线程率先进入同步代码块并先执行了 3 而没有执行 2，此时因为 instance 已经非 null。
 * 这时候线程 B 在第一次检查的时候，会发现 instance 已经是 非null 了，就将其返回使用，但是此时 instance 实际上还未初始化，自然就会出错。
 * 所以我们要限制实例对象的指令重排，用 volatile 修饰（JDK 5 之前使用了 volatile 的双检锁是有问题的）。
 */
public class SingletonLazy {
    // volatile 1.禁止命令重排 2.保证变量可见性
    private static volatile SingletonLazy instance = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {                         // 第一次检查：检查实例，如果不存在，进入同步块区
            synchronized (SingletonLazy.class) {        // 在类对象上加锁
                if (instance == null) {                 // 第二次检查：进入同步区块后，再检查一次，如果仍然是null，才创建实例
                    instance = new SingletonLazy();     // 实例化
                }
            }
        }
        return instance;
    }

    // 自定义方法
    public void showMessage() {
        System.out.println("Hello Singleton Lazy!");
    }
}
