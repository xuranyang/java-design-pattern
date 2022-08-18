package strategy_pattern.Example3;

//@Service
public class WechatPay implements IPaymentStrategy {
    @Override
    public PayResult pay(Order order) {
        return new PayResult(200, "微信支付成功:" + order.getAmount());
    }
}
