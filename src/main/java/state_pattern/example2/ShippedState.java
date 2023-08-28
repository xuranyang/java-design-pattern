package state_pattern.example2;


public class ShippedState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing shipped order");
        // 在已发货订单状态下的处理逻辑
        // ...
        order.setState(new DeliveredState()); // 切换状态
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cancelling shipped order");
        // 在已发货订单状态下的取消逻辑
        // ...
        order.setState(new CancelledState()); // 切换状态
    }
}
