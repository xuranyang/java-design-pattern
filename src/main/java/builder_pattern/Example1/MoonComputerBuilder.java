package builder_pattern.Example1;

/**
 * 创建组装计算机类：商家实现了抽象的 Builder 类，
 * MoonComputerBuilder 类用于组装计算机
 */
public class MoonComputerBuilder extends Builder {
    private Computer mComputer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        mComputer.setmCpu(cpu);
    }

    @Override
    public void buildMainboard(String mainboard) {
        mComputer.setmMainboard(mainboard);
    }

    @Override
    public void buildRam(String ram) {
        mComputer.setmRam(ram);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}