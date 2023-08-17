package adapter_pattern.example2;

public class Client {
    public static void main(String[] args) {
        ChinaPlugImpl chinaPlug = new ChinaPlugImpl();
        HongKongPlug adapter = new Adapter(chinaPlug);
        adapter.getHongKongPlug();
    }
}
