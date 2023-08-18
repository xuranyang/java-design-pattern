package command_pattern.example3;

public class RemoteControl {
    Command onCommand;
    Command offCommand;

    public RemoteControl() {

    }

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOnButton() {
        //execute() 方法中封装了打开电灯的方法
        onCommand.execute();
    }

    public void pressOffButton() {
        //execute() 方法中封装了关闭电灯的方法
        offCommand.execute();
    }
}
