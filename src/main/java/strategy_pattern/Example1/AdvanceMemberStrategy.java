package strategy_pattern.Example1;

// 高级会员类 20%折扣
public class AdvanceMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price, int n) {
        double money = price * n - price * n * 0.2;
        return money;
    }
}
