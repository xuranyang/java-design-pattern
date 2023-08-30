package visitor_pattern.example2;

// Tyre类：具体轮胎元素类
public class Tyre implements Component {
    private String name;
    private double quality;
    private double density;

    @Override
    public void accept(CalculateContent content) {
        content.calculate(this);
    }

    public Tyre(String name, double quality, double density) {
        this.name = name;
        this.quality = quality;
        this.density = density;
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