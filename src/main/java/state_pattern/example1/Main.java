package state_pattern.example1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.process(); // 处理新订单
        order.process(); // 处理已发货订单
        order.process(); // 处理已交付订单
    }
}
