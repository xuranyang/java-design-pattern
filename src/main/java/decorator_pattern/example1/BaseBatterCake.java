package decorator_pattern.example1;

// Concrete Component
public class BaseBatterCake extends BatterCake {
    @Override
    public String getMessage() {
        return "煎饼果子";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
