package mediator_pattern.example1;

public abstract class Mediator {

    /**注册同事类*/
    public abstract void register(Colleague colleague);

    /**处理接收逻辑*/
    public abstract void operation(Colleague colleague);
}

