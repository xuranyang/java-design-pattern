package proxy_pattern.example3;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserServiceInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行方法前");
        Object result = methodProxy.invokeSuper(obj, args);
        System.out.println("执行方法后");
        return result;
    }
}
