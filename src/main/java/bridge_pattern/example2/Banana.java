package bridge_pattern.example2;

public class Banana implements Fruit{
    @Override
    public void beAdd(String food) {
        System.out.println("香蕉" + food);
    }
}
