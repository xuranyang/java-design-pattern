package state_pattern.example2;

public class CancelledState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Cannot process cancelled order");
        // 取消订单状态下不执行任何处理逻辑
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel already cancelled order");
        // 取消订单状态下不执行任何取消逻辑
    }
}
