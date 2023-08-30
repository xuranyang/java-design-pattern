package visitor_pattern.example2;

// Car类：具体汽车元素类
public class Car implements Component {
    private String name;    //名称
    private double quality;    //质量
    private double density;    //密度

    public Car(String name, double quality, double density) {
        this.name = name;
        this.quality = quality;
        this.density = density;
    }

    @Override
    public void accept(CalculateContent content) {
        content.calculate(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
