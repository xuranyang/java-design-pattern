public class InterfaceTest {
    public static void execAop(Executor executor) {
        System.out.println("======> before");
        executor.execute();
        System.out.println("<====== after");
    }

    public static void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        execAop(new Executor() {
            @Override
            public void execute() {
                hello();
                System.out.println("To do Sth1.");
            }
        });

        execAop(() -> {
            hello();
            System.out.println("To do Sth2.");
        });
    }
}

interface Executor {
    public void execute();
}
