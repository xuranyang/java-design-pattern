package decorator_pattern.example1;

// Decorator
public abstract class BatterCakeDecorator extends BatterCake {
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    public String getMessage() {
        return this.batterCake.getMessage();
    }

    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }

    // 定义其它扩展方法
    public abstract void doSomething();
}
