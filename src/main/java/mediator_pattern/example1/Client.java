package mediator_pattern.example1;

public class Client {
    public static void main(String[] args) {
        Mediator concreteMediator = new ConcreteMediator();
        Colleague concreteColleague1 = new ConcreteColleague1();
        Colleague concreteColleague2 = new ConcreteColleague2();
        concreteMediator.register(concreteColleague1);
        concreteMediator.register(concreteColleague2);
        concreteColleague1.send();
        concreteColleague2.send();
    }
}
