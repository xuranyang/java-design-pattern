package command_pattern.example5;

public class Main {
    public static void main(String[] args) {
        Runnable task = new MyTask(); // 创建具体命令(未使用接收者)
        Thread thread = new Thread(task); // 设置命令
        thread.start(); // 执行命令

        Runnable task2 = new MyTask2(new Receiver()); // 创建具体命令(使用了接收者)
        thread = new Thread(task2); // 设置命令
        thread.start(); // 执行命令
    }
}
