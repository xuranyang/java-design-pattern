package state_pattern.example1;


// 具体状态类 - 新订单
public class NewState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing new order");
        // 在新订单状态下的处理逻辑
        // ...
        order.setState(new ShippedState()); // 切换状态
    }
}
