package observer_pattern.example1;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        subject.setState(10);
        // 输出：
        // Observer state updated: 10
        // Observer state updated: 10

        subject.setState(20);
        // 输出：
        // Observer state updated: 20
        // Observer state updated: 20

        subject.unregisterObserver(observer2);

        subject.setState(30);
        // 输出：
        // Observer state updated: 30
    }
}
