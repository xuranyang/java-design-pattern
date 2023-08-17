package singleton_pattern;

/**
 * 饿汉式单例模式
 * <p>
 * 访问方式：
 * SingletonHungry instance = SingletonHungry.getInstance();
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    /**
     * 写法二：
     * private static SingletonHungry instance = null;
     * static {
     * instance = new SingletonHungry();
     * }
     */

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }

    // 自定义方法
    public void showMessage() {
        System.out.println("Hello Singleton Hungry!");
    }
}
