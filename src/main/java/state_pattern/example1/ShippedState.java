package state_pattern.example1;

// 具体状态类 - 已发货订单
public class ShippedState implements OrderState{
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing shipped order");
        // 在已发货订单状态下的处理逻辑
        // ...
        order.setState(new DeliveredState()); // 切换状态
    }
}
