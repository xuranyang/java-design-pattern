package bridge_pattern.example2;

public class Strawberry implements Fruit{
    @Override
    public void beAdd(String food) {
        System.out.println("草莓" + food);
    }
}
