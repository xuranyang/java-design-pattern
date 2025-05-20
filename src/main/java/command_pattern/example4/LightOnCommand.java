package command_pattern.example4;

// ConcreteCommand
public class LightOnCommand implements Command {
    private Light light;

    // 具体命令：开灯
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
