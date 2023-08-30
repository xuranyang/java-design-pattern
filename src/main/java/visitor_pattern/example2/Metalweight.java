package visitor_pattern.example2;

// Mentalweight类：具体的计算金属重量类
public class Metalweight extends CalculateContent {
    @Override
    public void calculate(Carframe content) {
        double quality = content.getQuality();
        double weight = quality * 2;
        System.out.println("金属车架的重量为：" + weight + "斤");
    }

    @Override
    public void calculate(Tyre content) {
    }

    @Override
    public void calculate(Seat content) {
    }

    @Override
    public void calculate(Car content) {
    }
}