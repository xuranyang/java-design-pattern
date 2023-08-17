package adapter_pattern.example1;

// 类适配器类
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
