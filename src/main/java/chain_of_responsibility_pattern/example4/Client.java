package chain_of_responsibility_pattern.example4;

public class Client {
    public static void main(String[] args) {
        Handler first = new FirstInterview();
        Handler second = new SecondInterview();
        Handler third = new ThirdInterview();
        first.setHandler(second);
        second.setHandler(third);

        // 第一次面试
        first.handleRequest(1);
        // 第二次面试
        first.handleRequest(2);
        // 第三次面试
        first.handleRequest(3);
    }
}
