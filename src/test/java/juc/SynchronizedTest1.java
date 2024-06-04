package juc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * 类锁的锁对象实际上为该类的 class对象;
 * 而对象锁的锁对象为调用该同步方法的对应实例对象，如果是两个不同的对象，这两个对象的内存地址明显不同，所以其占有的锁资源不同
 */
public class SynchronizedTest1 {
    public static void main(String[] args) throws Exception {
        example1();
//        example2();
    }

    static void example1() throws Exception {
        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("user1", 100);

        // 2个不同对象
        FutureTask<String> taskAdd = new FutureTask<>(new SafeChange(userMap, "user1", 10, 3));
        FutureTask<String> taskSub = new FutureTask<>(new SafeChange(userMap, "user1", -5, 1));

        Thread t1 = new Thread(taskAdd);
        Thread t2 = new Thread(taskSub);
        t1.start();
        t2.start();

        String s1 = taskAdd.get();
        String s2 = taskSub.get();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("最终余额:" + userMap);
    }

    static void example2() throws Exception {
        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("user1", 100);

        SafeChange safeChange = new SafeChange(userMap, "user1", 10, 3);
        // 使用同一个对象
        FutureTask<String> taskAdd1 = new FutureTask<>(safeChange);
        FutureTask<String> taskAdd2 = new FutureTask<>(safeChange);

        Thread t1 = new Thread(taskAdd1);
        Thread t2 = new Thread(taskAdd2);
        t1.start();
        t2.start();

        String s1 = taskAdd1.get();
        String s2 = taskAdd2.get();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("最终余额:" + userMap);
    }
}

class SafeChange implements Callable<String> {
    Map<String, Integer> userMap;
    String user;
    int num;
    long costTime;

    SafeChange(Map<String, Integer> userMap, String user, int num, long costTime) {
        this.userMap = userMap;
        this.user = user;
        this.num = num;
        this.costTime = costTime;
    }

    // synchronized String call() 或者 synchronized (this) 只有example2是可以的，在example1中都是不行的
    // 类锁的锁对象实际上为该类的class对象，example1中的两个对象都是同一个class类，所以其占有的锁资源相同
    // 而对象锁的锁对象为调用该同步方法的对应实例对象，example1中的两个SafeChange对象的内存地址明显不同，所以其占有的锁资源不同
    @Override
    public String call() throws Exception {
        // 使用 synchronized (userMap) 保证同时只能有一个线程操作 userMap对象，example1和example2都可以
        // 使用 synchronized (SafeChange.class) 同时只能有一个线程操作 SafeChange类的对象，example1和example2 也都可以
        // 但是 synchronized (this) 只有在example2可以，在example1中是不行的
        // synchronized (this)写法等价于 synchronized String call()，在example1中锁的不是同一个对象，不会互斥
        synchronized (userMap) {
            Integer balance = userMap.get(user);
            System.out.println(Thread.currentThread().getName() + "->修改前:" + balance);

            TimeUnit.SECONDS.sleep(costTime);
            balance += num;

            System.out.println(Thread.currentThread().getName() + "->修改后:" + balance);
            userMap.put(user, balance);
            return Thread.currentThread().getName() + "余额：" + balance;
        }
    }
}
