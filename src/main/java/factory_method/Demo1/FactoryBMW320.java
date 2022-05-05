package factory_method.Demo1;

public class FactoryBMW320 implements FactoryBMW{
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
