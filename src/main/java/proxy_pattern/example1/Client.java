package proxy_pattern.example1;

public class Client {
    public static void main(String[] args) {
        // 普通代理模式通过使用额外的代理层来控制对真实对象的访问，并可以在访问前后添加额外的处理逻辑，从而提供更多的控制和灵活性
        // 静态代理
        Subject proxy = new StaticProxy();
        proxy.request();


        // JDK动态代理
        // 创建真实主题对象
        Subject realSubject = new RealSubject();

        // 创建代理处理器对象并传入真实主题对象
        DynamicProxy handler = new DynamicProxy(realSubject);

        // 使用 Proxy.newProxyInstance() 方法动态生成代理对象
        Subject dyamicProxy = (Subject) java.lang.reflect.Proxy.newProxyInstance(
                Client.class.getClassLoader(), new Class[]{Subject.class}, handler);

        // 调用代理对象的方法
        dyamicProxy.request();
    }
}
