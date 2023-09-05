package bridge_pattern.example1;

public class Benz extends AbstractCar{
    public Benz(AbstractEngine abstractEngine) {
        super(abstractEngine);
    }

    @Override
    public void run() {
        System.out.println(super.abstractEngine.engine() + "Benz");
    }
}
