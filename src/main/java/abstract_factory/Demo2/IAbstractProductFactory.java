package abstract_factory.Demo2;

//产品工厂接口
public interface IAbstractProductFactory {
    //生产手机
    IPhoneProduct phoneProduct();

    //生成路由器
    IRouterProduct routerProduct();
}
