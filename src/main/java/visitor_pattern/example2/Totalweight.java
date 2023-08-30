package visitor_pattern.example2;

// Totalweight类：具体的计算汽车总重类
public class Totalweight extends CalculateContent {
    @Override
    public void calculate(Carframe content) {
        double quality = content.getQuality();
        double weight = quality * 2;
        System.out.println("车架的重量为：" + weight + "斤");
    }

    @Override
    public void calculate(Tyre content) {
        double quality = content.getQuality();
        double weight = quality * 2;
        System.out.println("轮胎的重量为：" + weight + "斤");
    }

    @Override
    public void calculate(Seat content) {
        double quality = content.getQuality();
        double weight = quality * 2;
        System.out.println("座位的重量为：" + weight + "斤");
    }

    //计算汽车总重量
    @Override
    public void calculate(Car content) {
        double quality = content.getQuality();
        double weight = quality * 2;
        System.out.println("汽车总重为：" + weight + "斤");
    }
}
