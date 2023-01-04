package ManualAop;

// 调用invoke就可以执行匿名函数
public class HelloInteceptor implements Interceptor {
    @Override
    public void invoke(Invoke invoke) {
        System.out.println("执行前");
        try {
            invoke.invoke();
        } catch (Exception e) {
            System.out.println("假如出现错误");
        }
        System.out.println("执行后");
    }
}
