package command_pattern.example5;

public class MyTask2 implements Runnable {
    private Receiver receiver;

    public MyTask2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void run() {
        receiver.action();
        System.out.println("Task2 is running");
    }
}
