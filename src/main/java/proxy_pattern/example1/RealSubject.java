package proxy_pattern.example1;

// 具体主题
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}
