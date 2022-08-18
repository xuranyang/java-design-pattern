package strategy_pattern.Example3;


public enum PayStrategyEnum {
    AliPay("AliPay", new AliPay()),
    WechatPay("WechatPay", new WechatPay()),
    UnionPay("UnionPay", new UnionPay())
    ;

    private String payType;
    private IPaymentStrategy payStrategy;

    PayStrategyEnum(String payType, IPaymentStrategy payStrategy) {
        this.payType = payType;
        this.payStrategy = payStrategy;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public IPaymentStrategy getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(IPaymentStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}
