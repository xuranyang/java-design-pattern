package proxy_pattern.example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 动态代理
public class CalculatorInvocationHandler implements InvocationHandler {
    private final Object target;

    public CalculatorInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行方法前");
        Object result = method.invoke(target, args);
        System.out.println("执行方法后");
        return result;
    }
}
