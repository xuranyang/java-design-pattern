package mediator_pattern.example1;

public class ConcreteColleague2 extends Colleague{

    @Override
    public void receive() {
        System.out.println("具体同事类 ConcreteColleague2 接收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类 ConcreteColleague2 发送请求");
        mediator.operation(this);
    }
}
