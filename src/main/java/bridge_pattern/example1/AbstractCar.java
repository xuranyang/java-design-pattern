package bridge_pattern.example1;

public abstract class AbstractCar {
    public AbstractEngine abstractEngine;

    public AbstractCar(AbstractEngine abstractEngine) {
        this.abstractEngine = abstractEngine;
    }

    public abstract void run();
}
