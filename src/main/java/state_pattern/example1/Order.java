package state_pattern.example1;

// Context
public class Order {
    private OrderState orderState;

    public Order() {
        this.orderState = new NewState();
    }

    public void process() {
        orderState.processOrder(this);
    }

    public void setState(OrderState orderState) {
        this.orderState = orderState;
    }
}
