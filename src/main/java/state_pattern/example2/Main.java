package state_pattern.example2;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.process(); // 处理新订单
        order.process(); // 处理已发货订单
        order.cancel(); // 取消已发货订单

        order.process(); // 处理已交付订单
        order.cancel(); // 取消已经取消的订单
    }
}
