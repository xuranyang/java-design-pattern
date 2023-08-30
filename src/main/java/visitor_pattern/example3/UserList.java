package visitor_pattern.example3;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    List<User> userList = new ArrayList<User>();


    public UserList() {
        userList.add(new Student("小马", "重点班", "一年一班"));
        userList.add(new Student("小张", "重点班", "一年一班"));
        userList.add(new Student("小刘", "普通班", "二年三班"));
        userList.add(new Student("小董", "普通班", "三年四班"));
        userList.add(new Teacher("Tom", "特级教师", "一年一班"));
        userList.add(new Teacher("Jack", "特级教师", "一年一班"));
        userList.add(new Teacher("Rose", "普通教师", "二年三班"));
        userList.add(new Teacher("Bob", "实习教师", "三年四班"));
    }

    // 展示
    public void show(Visitor visitor) {
        for (User user : userList) {
            user.accept(visitor);
        }
    }
}
