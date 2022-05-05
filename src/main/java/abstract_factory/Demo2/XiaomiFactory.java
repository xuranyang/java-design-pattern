package abstract_factory.Demo2;

public class XiaomiFactory implements IAbstractProductFactory {
    @Override
    public IPhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
