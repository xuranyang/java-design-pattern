package singleton_pattern;

public class Main {
    public static void main(String[] args) {
        SingletonHungry instance = SingletonHungry.getInstance();
        instance.showMessage();

        SingletonLazy instance2 = SingletonLazy.getInstance();
        instance2.showMessage();
    }
}
