package abstract_factory.Demo2;

//华为工厂实现类
public class HuaweiFactory implements IAbstractProductFactory {
    @Override
    public IPhoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaweiRouter();
    }
}
