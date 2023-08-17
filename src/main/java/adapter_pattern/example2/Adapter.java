package adapter_pattern.example2;

// 适配器类
public class Adapter implements HongKongPlug {
    private ChinaPlug chinaPlug;

    public Adapter(ChinaPlug chinaPlug) {
        this.chinaPlug = chinaPlug;
    }


    @Override
    public void getHongKongPlug() {
        System.out.println("===转换成===");
        chinaPlug.getChinaPlug(); // 调用大陆插头的方法
    }
}
