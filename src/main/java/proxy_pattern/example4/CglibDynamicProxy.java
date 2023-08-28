package proxy_pattern.example4;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {
    private Object target;

    public CglibDynamicProxy(Object target) {
        this.target = target;
    }

    // 给目标创建代理对象
    public Object newProxyInstance() {
        // 1.工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类（代理对象）
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = method.invoke(this.target, args);

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("接口响应时间：" + responseTime);
        return result;
    }
}
