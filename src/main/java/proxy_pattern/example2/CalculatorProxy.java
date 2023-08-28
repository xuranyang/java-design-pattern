package proxy_pattern.example2;

// 静态代理
public class CalculatorProxy implements Calculator {
    private final Calculator calculator;

    public CalculatorProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("执行加法操作");
        return calculator.add(a, b);
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("执行减法操作");
        return calculator.sub(a, b);
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("执行乘法操作");
        return calculator.mul(a, b);
    }

    @Override
    public double div(int a, int b) {
        System.out.println("执行除法操作");
        return calculator.div(a, b);
    }
}
