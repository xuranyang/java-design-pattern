package command_pattern.example1;

public class Invoker {
    private Command command;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        System.out.println("这里是调用者，执行命令");
        command.execute();
    }
}
