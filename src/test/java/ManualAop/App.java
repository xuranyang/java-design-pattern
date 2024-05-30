package ManualAop;

public class App {
    public static void main(String[] args) {
        Hello hello = Aop.get(Hello.class);
//        new HelloInteceptor().invoke(new Invoke() {
//            @Override
//            public void invoke() {
//                hello.test();
//            }
//        });

//        new HelloInteceptor().invoke(() -> hello.test());
//        new HelloInteceptor().invoke(hello::test);

//        Aop.invoke(new HelloInteceptor(), new Invoke() {
//            @Override
//            public void invoke() {
//                hello.test();
//            }
//        });

//        Aop.invoke(new HelloInteceptor(), () -> {
//            hello.test();
//        });

        Aop.invoke(new HelloInterceptor(), hello::test);

    }
}


