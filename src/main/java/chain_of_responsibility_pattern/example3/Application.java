package chain_of_responsibility_pattern.example3;

// 职责链模式还有一种变体，那就是请求会被所有的处理器都处理一遍，不存在中途终止的情况
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
