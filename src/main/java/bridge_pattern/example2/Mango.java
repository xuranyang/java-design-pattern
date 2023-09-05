package bridge_pattern.example2;

public class Mango implements Fruit{
    @Override
    public void beAdd(String food) {
        System.out.println("芒果" + food);
    }
}
