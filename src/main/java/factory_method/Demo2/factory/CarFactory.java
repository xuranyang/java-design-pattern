package factory_method.Demo2.factory;

import factory_method.Demo2.product.Car;

public interface CarFactory {
    // 可以创建任何车
    Car createCar();
}
