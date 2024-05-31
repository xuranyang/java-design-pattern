package ManualAop;

public class Aop {
    // 根据传入的class对对象进行实例化，相当于Spring的IOC功能
    public static <T> T get(Class<T> clazz) {
        try {
            return clazz.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("获取实例化对象失败");
        }
    }
    // 使用AOP功能,传入一个拦截器和匿名方法就可以
    public static void invoke(Interceptor interceptor, Invoke invoke){
        interceptor.invoke(invoke);
    }
}



