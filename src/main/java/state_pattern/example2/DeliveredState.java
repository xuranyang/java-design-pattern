package state_pattern.example2;

public class DeliveredState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing delivered order");
        // 在已交付订单状态下的处理逻辑
        // ...
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cancelling delivered order");
        // 在已交付订单状态下的取消逻辑
        // ...
        order.setState(new CancelledState()); // 切换状态
    }
}
