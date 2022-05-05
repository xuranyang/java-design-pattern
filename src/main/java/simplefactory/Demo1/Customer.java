package simplefactory.Demo1;

public class Customer {
    public static void main(String[] args) {
//        BMW320 bmw320 = new BMW320();
//        BMW523 bmw523 = new BMW523();
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
