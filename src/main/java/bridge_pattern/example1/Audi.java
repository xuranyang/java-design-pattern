package bridge_pattern.example1;

public class Audi extends AbstractCar {
    public Audi(AbstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public void run() {
        System.out.println(super.abstractEngine.engine() + "Audi");
    }
}
