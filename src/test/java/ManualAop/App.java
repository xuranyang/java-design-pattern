package ManualAop;

public class App {
    public static void main(String[] args) {
        Hello hello = Aop.get(Hello.class);
//        new HelloInterceptor().invoke(new Invoke() {
//            @Override
//            public void invoke() {
//                hello.test();
//            }
//        });

//        new HelloInterceptor().invoke(() -> hello.test());
//        new HelloInterceptor().invoke(hello::test);

//        Aop.invoke(new HelloInterceptor(), new Invoke() {
//            @Override
//            public void invoke() {
//                hello.test();
//            }
//        });

//        Aop.invoke(new HelloInterceptor(), () -> {
//            hello.test();
//        });

        Aop.invoke(new HelloInterceptor(), hello::test);

    }
}


