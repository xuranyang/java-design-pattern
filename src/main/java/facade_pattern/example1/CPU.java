package facade_pattern.example1;

// 子系统类
public class CPU {
    public void start() {
        System.out.println("CPU: Starting...");
    }

    public void shutdown() {
        System.out.println("CPU shut down.");
    }

}
