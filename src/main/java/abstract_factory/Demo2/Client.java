package abstract_factory.Demo2;

public class Client {
    public static void main(String[] args) {
        System.out.println("============小米产品============");
        //创建小米工厂
        IAbstractProductFactory xiaomiFactory = new XiaomiFactory();

        //生产小米手机
        IPhoneProduct xiaomiPhone = xiaomiFactory.phoneProduct();
        xiaomiPhone.start();
        xiaomiPhone.sendSMS();

        //生产小米路由器
        IRouterProduct xiaomiRouter = xiaomiFactory.routerProduct();
        xiaomiRouter.openwifi();
        xiaomiRouter.setting();

        System.out.println("============华为产品============");
        //创建华为工厂
        IAbstractProductFactory huaweiFactory = new HuaweiFactory();

        //生产华为手机
        IPhoneProduct huaweiPhone = huaweiFactory.phoneProduct();
        huaweiPhone.start();
        huaweiPhone.sendSMS();

        //生产华为路由器
        IRouterProduct huaweiRouter = huaweiFactory.routerProduct();
        huaweiRouter.openwifi();
        huaweiRouter.setting();
    }
}
