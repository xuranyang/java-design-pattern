package factory_method.Demo2.factory;

import factory_method.Demo2.product.BenzCar;
import factory_method.Demo2.product.Car;

public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BenzCar();
    }
}
