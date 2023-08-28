package facade_pattern.example1;

public class Client {
    public static void main(String[] args) {
        // 外观类 ComputerFacade 封装了子系统类 CPU、Memory 和 HardDrive
        // 客户端只需要通过外观类的 startComputer() 方法启动计算机，而不需要了解每个子系统类的具体实现细节
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
        computer.shutdownComputer();
    }
}
