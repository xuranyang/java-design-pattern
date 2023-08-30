package visitor_pattern.example2;

// Materialvolume类：具体的计算各材料体积类
public class Materialvolume extends CalculateContent {
    @Override
    public void calculate(Car content) {
        double quality = content.getQuality();
        double density = content.getDensity();
        double volumn = quality * density;
        System.out.println("汽车的体积为：" + volumn + "立方");
    }

    @Override
    public void calculate(Carframe content) {
        double quality = content.getQuality();
        double density = content.getDensity();
        double volumn = quality * density;
        System.out.println("车架所占体积为：" + volumn + "立方");
    }

    @Override
    public void calculate(Tyre content) {
        double quality = content.getQuality();
        double density = content.getDensity();
        double volumn = quality * density;
        System.out.println("轮胎所占体积为：" + volumn + "立方");
    }

    @Override
    public void calculate(Seat content) {
        double quality = content.getQuality();
        double density = content.getDensity();
        double volumn = quality * density;
        System.out.println("座位所占体积为：" + volumn + "立方");
    }
}
