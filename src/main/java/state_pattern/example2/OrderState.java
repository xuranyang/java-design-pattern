package state_pattern.example2;

public interface OrderState {
    void processOrder(Order order);

    void cancelOrder(Order order);
}
