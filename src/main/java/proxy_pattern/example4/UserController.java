package proxy_pattern.example4;

// 具体主题类
public class UserController implements IUserController {
    @Override
    public void login(String username, String password) {
        // 登录逻辑
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(username + "登录成功");
    }

    @Override
    public void register(String username, String password) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 注册逻辑
        System.out.println(username + "注册成功");
    }
}
