package proxy_pattern.example4;

import java.lang.reflect.Proxy;

public class DynamicProxyClient {
    public static void main(String[] args) {
        // 1、创建具体主题类
        UserController userController = new UserController();
        // 2、创建 Handler
        // JDK 动态代理
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(userController);
        // 3、动态产生代理类
        IUserController o = (IUserController) Proxy.newProxyInstance(
                userController.getClass().getClassLoader(),
                userController.getClass().getInterfaces(),
                dynamicProxyHandler
        );

        o.login("abc", "123456");
        o.register("efg", "123456");

        // CGLIB 动态代理
        CglibDynamicProxy cglibDynamicProxy = new CglibDynamicProxy(userController);
        UserController o2 = (UserController) cglibDynamicProxy.newProxyInstance();

        o2.login("xyz", "123456");
        o2.register("rtz", "123456");

    }
}
