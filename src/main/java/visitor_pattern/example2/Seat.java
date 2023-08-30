package visitor_pattern.example2;

// Seat类：具体座位元素类
public class Seat implements Component {
    private String name;
    private double quality;
    private double density;

    public Seat(String name, double quality, double density) {
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