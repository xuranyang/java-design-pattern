package proxy_pattern.example2;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new RealCalculator();
        int a = 1, b = 2;

        System.out.println("====================== 静态代理 ======================");
        // 静态代理
        CalculatorProxy calculatorProxy = new CalculatorProxy(calculator);
        System.out.println(calculatorProxy.add(a, b));
        System.out.println(calculatorProxy.sub(a, b));
        System.out.println(calculatorProxy.mul(a, b));
        System.out.println(calculatorProxy.div(a, b));


        System.out.println("====================== JDK 动态代理 ======================");
        // JDK 动态代理
        CalculatorInvocationHandler handler = new CalculatorInvocationHandler(calculator);
        Calculator proxy = (Calculator) Proxy.newProxyInstance(
                calculator.getClass().getClassLoader(),
                calculator.getClass().getInterfaces(),
                handler);

        System.out.println("add: " + proxy.add(a, b));
        System.out.println("sub: " + proxy.sub(a, b));
        System.out.println("mul: " + proxy.mul(a, b));
        System.out.println("div: " + proxy.div(a, b));
    }
}
