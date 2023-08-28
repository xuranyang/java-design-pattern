package proxy_pattern.example1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 动态代理

/**
 * InvocationHandler 接口：该接口定义了代理类需要实现的方法，即代理类在处理方法调用时需要进行的操作。
 * 代理类通过实现 InvocationHandler 接口来自定义对被代理对象方法的调用规则。
 */
public class DynamicProxy implements InvocationHandler {
    private Object realObject;

    public DynamicProxy(Object realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ProxyHandler: Preparing request.");
        Object result = method.invoke(realObject, args);
        System.out.println("ProxyHandler: Cleaning up after request.");
        return result;
    }
}
