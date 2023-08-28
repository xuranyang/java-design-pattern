package proxy_pattern.example4;

// 代理主题类
public class UserControllerProxy implements IUserController {
    private IUserController userController;

    public UserControllerProxy(IUserController userController) {
        this.userController = userController;
    }

    @Override
    public void login(String username, String password) {
        long startTime = System.currentTimeMillis();
        userController.login(username, password);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("登录接口响应时间：" + responseTime);
    }

    @Override
    public void register(String username, String password) {
        long startTime = System.currentTimeMillis();
        userController.register(username, password);
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("注册接口响应时间：" + responseTime);
    }
}
