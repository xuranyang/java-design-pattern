package command_pattern.example4;

// ConcreteCommand
public class LightOffCommand implements Command {
    private Light light;

    // 具体命令：关灯
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
