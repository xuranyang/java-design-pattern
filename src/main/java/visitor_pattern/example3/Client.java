package visitor_pattern.example3;

public class Client {
    public static void main(String[] args) {
        UserList userList = new UserList();
        System.out.println("家长视角访问：");
        userList.show(new Parent());

        System.out.println("校长视角访问：");
        userList.show(new Principal());
    }
}
