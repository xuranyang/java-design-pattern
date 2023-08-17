package factory_method.Demo2.factory;

import factory_method.Demo2.product.Car;
import factory_method.Demo2.product.FerrariCar;

public class FerrariFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new FerrariCar();
    }
}
