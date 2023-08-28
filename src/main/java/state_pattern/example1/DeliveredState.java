package state_pattern.example1;

// 具体状态类 - 已交付订单
public class DeliveredState implements OrderState{
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing delivered order");
        // 在已交付订单状态下的处理逻辑
        // ...
    }
}
