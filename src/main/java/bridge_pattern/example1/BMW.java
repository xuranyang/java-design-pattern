package bridge_pattern.example1;

public class BMW extends AbstractCar {
    public BMW(AbstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public void run() {
        System.out.println(super.abstractEngine.engine() + "BMW");
    }
}
