package decorator_pattern.example1;

// Concrete Decorator
public class EggDecorator extends BatterCakeDecorator {
    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public void doSomething() {

    }


    //手动重写父类方法
    @Override
    public String getMessage() {
        return super.getMessage() + "+1煎蛋";
    }

    //手动重写父类方法
    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
