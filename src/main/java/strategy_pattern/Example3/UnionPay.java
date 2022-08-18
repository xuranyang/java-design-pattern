package strategy_pattern.Example3;

//@Service
public class UnionPay implements IPaymentStrategy {
    @Override
    public PayResult pay(Order order) {
        return PayResult.success("银联支付成功:" + order.getAmount());
    }
}
