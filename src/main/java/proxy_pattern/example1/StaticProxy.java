package proxy_pattern.example1;

// 静态代理
public class StaticProxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("Proxy: Preparing request.");
    }

    private void postRequest() {
        System.out.println("Proxy: Cleaning up after request.");
    }

}
