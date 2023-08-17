package adapter_pattern.example2;

public class ChinaPlugImpl implements ChinaPlug {
    @Override
    public void getChinaPlug() {
        System.out.println("大陆插头");
    }
}
