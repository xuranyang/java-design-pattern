package command_pattern.example4;

public class Client {
    public static void main(String[] args) {
        // 创建接收者
        Light light = new Light();

        // 创建命令对象
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // 创建调用者
        RemoteControl remote = new RemoteControl();

        // 执行开灯命令
        remote.setCommand(lightOn);
        remote.pressButton();

        // 执行关灯命令
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
