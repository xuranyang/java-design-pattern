package builder_pattern.Example2;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}