package observer_pattern.example1;

public class ConcreteObserver implements Observer {
    private int observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        // 注册到观察者队列中
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        observerState = subject.getState();
        System.out.println("Observer state updated: " + observerState);
    }
}
