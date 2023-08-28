package proxy_pattern.example3;

import net.sf.cglib.proxy.Enhancer;

public class CglibClient {
    public static void main(String[] args) {
        // CGLIB 动态代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new UserServiceInterceptor());
        UserService proxy = (UserService) enhancer.create();

        proxy.addUser("Tom", "123456");
        proxy.updateUser("Tom", "654321");
        proxy.deleteUser("Tom");
    }
}
