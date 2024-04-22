package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class MyThread extends Thread {
    private int ticket = 10;

    public void run() {
        while (ticket > 0) {
            System.out.println(this.getName() + ":" + ticket--);
        }

    }
}

class MyRunnable implements Runnable {
    private int ticket = 10;

    @Override
    public void run() {
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + ticket--);
        }
    }
}

class MyCallable implements Callable<String> {
    private int ticket = 10;

    @Override
    public String call() throws Exception {
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":" + ticket--);
        }
        return Thread.currentThread().getName() + " is Finished";
    }
}

/**
 * 实现多线程的四种方式：
 * 1.继承Thread类
 * 2.实现Runnable接口
 * 3.实现Callable接口
 * 4.线程池
 */
public class ThreadTest {
    public static void main(String[] args) throws Exception {
//        runThread1();
//        runThread2();
//        runThread3();
//        runThread4();
        runThread5();
    }

    public static void runThread1() {
        // 继承Thread类
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }

    public static void runThread2() {
        // 实现Runnable接口
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        t1.start();
        t2.start();
        t3.start();
    }

    public static void runThread3() throws Exception {
        // 实现Runnable接口
        MyCallable mc = new MyCallable();
        // 将任务封装为FutureTask
        FutureTask<String> task = new FutureTask<>(mc);

        Thread t1 = new Thread(task);
        t1.start();

        String result = task.get();
        System.out.println(result);
    }

    public static void runThread4() throws Exception {
        // Executors 创建线程池
        int poolSize = 3;
        // 线程池
        ExecutorService executorService = Executors.newFixedThreadPool(poolSize);
        List<Future> futureList = new ArrayList<>();
        for (int i = 0; i < poolSize; i++) {
            MyCallable mc = new MyCallable();
            Future<String> future = executorService.submit(mc);
            futureList.add(future);
        }

        // 关闭线程池
        executorService.shutdown();

        for (Future future : futureList) {
            // 从Future对象上获取任务的返回值，并输出到控制台
            System.out.println(">>>" + future.get());
        }

    }

    public static void runThread5() throws Exception {
        // ThreadPoolExecutor 创建线程池
        int poolSize = 3;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 1, TimeUnit.MINUTES, new LinkedBlockingDeque<>());
        List<Future> futureList = new ArrayList<>();
        for (int i = 0; i < poolSize; i++) {
            Future<String> future = threadPoolExecutor.submit(new MyCallable());
            futureList.add(future);
        }

        threadPoolExecutor.shutdown();

        for (Future future : futureList) {
            // 从Future对象上获取任务的返回值，并输出到控制台
            System.out.println(">>>" + future.get());
        }
    }
}
