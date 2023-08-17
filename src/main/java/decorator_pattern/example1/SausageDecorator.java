package decorator_pattern.example1;

public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public void doSomething() {

    }

    //手动重写父类方法
    @Override
    public String getMessage() {
        return super.getMessage() + "+1根香肠";
    }

    //手动重写父类方法
    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
