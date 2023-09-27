package chain_of_responsibility_pattern.example2;

// 数组实现方式
// 处理器链上的某个处理器能够处理这个请求，那就不会继续往下传递请求(只处理一次)
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
