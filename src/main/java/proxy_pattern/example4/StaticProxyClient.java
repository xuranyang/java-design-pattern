package proxy_pattern.example4;

public class StaticProxyClient {
    public static void main(String[] args) {
        // 基于接口编程
        IUserController userController = new UserControllerProxy(new UserController());
        userController.login("a", "123456");
        userController.register("b", "123456");

        // 基于继承
        IUserController userControllerExtend = new UserControllerProxyExtend();
        userControllerExtend.login("c", "123456");
        userControllerExtend.register("d", "123456");
    }
}
