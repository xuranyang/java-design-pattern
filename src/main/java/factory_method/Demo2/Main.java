package factory_method.Demo2;

import factory_method.Demo2.product.Car;
import factory_method.Demo2.factory.BenzFactory;
import factory_method.Demo2.factory.FerrariFactory;

public class Main {
    public static void main(String[] args) {
        FerrariFactory ferrariFactory = new FerrariFactory();
        BenzFactory benzFactory = new BenzFactory();

        Car ferrariCar = ferrariFactory.createCar();
        Car benzCar = benzFactory.createCar();

        ferrariCar.run();
        benzCar.run();
    }
}
