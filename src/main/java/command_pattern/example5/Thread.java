package command_pattern.example5;

public class Thread {
    private Runnable task;

    public Thread(Runnable task) {
        this.task = task;
    }

    public void start() {
        task.run();
    }
}
