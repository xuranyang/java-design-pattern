package threads;

import java.util.concurrent.*;

/**
 * CompletableFuture
 * runAsync    -> 沒有返回值
 * supplyAsync -> 有返回值
 */
public class ThreadTest3 {
    public static void main(String[] args) throws Exception {
//        supplyAsyncSingle();
        supplyAsyncThreadPool();
    }

    public static void supplyAsyncThreadPool() {
        /**
         * CompletableFuture 多线程实例
         * <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier, Executor executor)
         */
        // 创建一个线程池
//        Executor executor = Executors.newFixedThreadPool(4);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        System.out.println("Current Timestamp:" + System.currentTimeMillis());

        // 创建一个 CompletableFuture 并在独立线程中执行任务
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task 1 started on thread: " + Thread.currentThread().getName());
            // 模拟耗时操作
            try {
                Thread.sleep(2000);
                System.out.println("Task1 ended on thread: " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result-1";
        }, executor);

        // 创建另一个 CompletableFuture 并在独立线程中执行任务
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task 2 started on thread: " + Thread.currentThread().getName());
            // 模拟耗时操作
            try {
                Thread.sleep(4000);
                System.out.println("Task2 ended on thread: " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Result-2";
        }, executor);

        // 合并两个 CompletableFuture 的结果
        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
            System.out.println("Task 1 result: " + result1);
            System.out.println("Task 2 result: " + result2);
            return "Combined result: " + result1 + ", " + result2;
        });

        // 等待合并后的结果
        String finalResult = combinedFuture.join();
        System.out.println(finalResult);
        executor.shutdown();
    }

    public static void supplyAsyncSingle() throws InterruptedException {
        /**
         * CompletableFuture 单线程实例
         * <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier)
         */
        CompletableFuture
                //委托师傅做蛋糕
                .supplyAsync(() -> {
                    try {
                        System.out.println("师傅准备做蛋糕");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println("师傅做蛋糕做好了");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // supplyAsync 有返回值
                    return "提拉米苏";
                })
                //做好了告诉我一声
                .thenAccept(cake -> {
                    System.out.println("我吃蛋糕:" + cake);
                });
        System.out.println("我先去喝杯牛奶");
        Thread.currentThread().join();
    }
}
