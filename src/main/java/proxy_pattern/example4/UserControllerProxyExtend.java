package proxy_pattern.example4;

// 继承具体主题类
public class UserControllerProxyExtend extends UserController {
    @Override
    public void login(String username, String password) {
        long startTime = System.currentTimeMillis();

        // 登录逻辑
        super.login(username, password);

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("接口响应时间：" + responseTime);
    }

    @Override
    public void register(String username, String password) {
        long startTime = System.currentTimeMillis();

        // 注册逻辑
        super.register(username, password);

        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        System.out.println("接口响应时间：" + responseTime);
    }
}
