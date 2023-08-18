package command_pattern.example3;

public class Client {
    public static void main(String[] args) {
        // 定义一个远程遥控器
        RemoteControl remoteControl = new RemoteControl();
        // 定义一个电灯对象
        Light light = new Light();
        // 打开电灯的命令对象
        Command onCommand = new LightOnCommand(light);
        // 关闭电灯的命令对象
        Command offCommand = new LightOffCommand(light);

        // 给遥控板设置 开灯和关灯命令
        remoteControl.setCommand(onCommand, offCommand);
        remoteControl.pressOnButton();
        remoteControl.pressOffButton();
    }
}
