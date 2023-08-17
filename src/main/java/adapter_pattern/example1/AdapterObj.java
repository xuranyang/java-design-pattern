package adapter_pattern.example1;

// 对象适配器类
public class AdapterObj implements Target {
    private Adaptee adaptee;

    public AdapterObj(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
