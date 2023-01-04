package ManualAop;

public class App {
    public static void main(String[] args) {
        Hello hello = Aop.get(Hello.class);
//        Aop.invoke(new HelloInteceptor(), () -> {
//            hello.test();
//        });
        Aop.invoke(new HelloInteceptor(), hello::test);

    }
}


