package mediator_pattern.example1;

public class ConcreteColleague1 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类 ConcreteColleague1 接收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类 ConcreteColleague1 发送请求");
        /*中介者进行转发*/
        mediator.operation(this);
    }
}