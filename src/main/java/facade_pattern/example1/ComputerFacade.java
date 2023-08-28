package facade_pattern.example1;

// 外观类
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer started successfully.");
    }


    public void shutdownComputer() {
        System.out.println("Computer shutting down...");
        cpu.shutdown();
        memory.shutdown();
        hardDrive.shutdown();
        System.out.println("Computer shut down.");
    }
}
