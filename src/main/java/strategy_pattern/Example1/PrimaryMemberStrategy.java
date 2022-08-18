package strategy_pattern.Example1;

// 普通会员——不打折
// 实现策略
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price, int n) {
        //重写策略方法具体实现功能
        return price * n;
    }
}
