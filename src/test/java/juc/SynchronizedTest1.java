package juc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class SynchronizedTest1 {

    public static void main(String[] args) throws Exception {
        Map<String, Integer> userMap = new HashMap<>();
        userMap.put("user1", 100);

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

    @Override
    public String call() throws Exception {
        // synchronized (userMap) 保证同时只能有一个线程操作 userMap对象
        // synchronized (SafeChange.class) 或者同时只能有一个线程操作 SafeChange对象 也可以
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
