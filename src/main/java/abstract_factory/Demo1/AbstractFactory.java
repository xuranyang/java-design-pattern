package abstract_factory.Demo1;

public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
