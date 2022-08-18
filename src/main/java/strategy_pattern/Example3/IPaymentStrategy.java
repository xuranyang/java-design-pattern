package strategy_pattern.Example3;

public interface IPaymentStrategy {
    /**
     * 支付
     *
     * @param order 订单信息
     * @return PayResult 支付结果
     */
    PayResult pay(Order order);
}
