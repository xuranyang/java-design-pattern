package proxy_pattern.example2;

public class RealCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        System.out.println("正在执行add");
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("正在执行sub");
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("正在执行mul");
        return a * b;
    }

    @Override
    public double div(int a, int b) {
        System.out.println("正在执行div");
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为零");
        }
        return 1.0 * a / b;
    }
}
