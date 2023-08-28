package proxy_pattern.example3;

public class UserService {
    public void addUser(String username, String password) {
        System.out.println("add user: " + username + ", " + password);
    }

    public void updateUser(String username, String password) {
        System.out.println("update user: " + username + ", " + password);
    }

    public void deleteUser(String username) {
        System.out.println("delete user: " + username);
    }
}
