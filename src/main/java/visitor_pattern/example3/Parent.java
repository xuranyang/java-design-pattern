package visitor_pattern.example3;

public class Parent implements Visitor {

    public void visit(Student student) {
        System.out.println(String.format("学生信息 姓名：%s 班级：%s 排名：%s", student.name, student.clazz, student.ranking()));
    }

    public void visit(Teacher teacher) {
        System.out.println(String.format("老师信息 姓名：%s 班级：%s 级别：%s", teacher.name, teacher.clazz, teacher.identity));
    }

}
