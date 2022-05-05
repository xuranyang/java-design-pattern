package abstract_factory.Demo2;

//路由器产品接口
public interface IRouterProduct {
    //开机
    void start();

    //关机
    void shutdown();

    //打开wifi
    void openwifi();

    //设置
    void setting();
}
