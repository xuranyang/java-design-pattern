package proxy_pattern.example4;

public interface IUserController {
    //  登录
    void login(String username, String password);

    // 注册
    void register(String username, String password);
}
