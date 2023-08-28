package state_pattern.example2;

public class NewState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing new order");
        // 在新订单状态下的处理逻辑
        // ...
        order.setState(new ShippedState()); // 切换状态
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cancelling new order");
        // 在新订单状态下的取消逻辑
        // ...
        order.setState(new CancelledState()); // 切换状态
    }
}
