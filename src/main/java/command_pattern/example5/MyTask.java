package command_pattern.example5;

public class MyTask implements Runnable {
    // 在这里可以加 Receiver
    @Override
    public void run() {
        // receiver.action()
        System.out.println("Task is running");
    }
}
