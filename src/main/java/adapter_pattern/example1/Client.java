package adapter_pattern.example1;

public class Client {
    public static void main(String[] args) {
        // 类适配器模式
        Target target = new Adapter();
        target.request();

        // 对象适配器模式
        Adaptee adaptee = new Adaptee();
        Target target2 = new AdapterObj(adaptee);
        target2.request();
    }
}
