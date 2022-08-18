package strategy_pattern.Example3;

//@Service
public class AliPay implements IPaymentStrategy {
    @Override
    public PayResult pay(Order order) {
        return new PayResult(200, "支付宝支付成功:" + order.getAmount());
    }
}
