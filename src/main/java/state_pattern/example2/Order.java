package state_pattern.example2;

// Context
public class Order {
    private OrderState state;

    public Order() {
        state = new NewState();
    }

    public void process() {
        state.processOrder(this);
    }

    public void cancel() {
        state.cancelOrder(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
