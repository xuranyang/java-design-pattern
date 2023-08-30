package visitor_pattern.example3;

public class Principal implements Visitor {

    public void visit(Student student) {
        System.out.println(String.format("学生信息 姓名：%s 班级：%s", student.name, student.clazz));
    }

    public void visit(Teacher teacher) {
        System.out.println(String.format("老师信息 姓名：%s 班级：%s 升学率：%s", teacher.name, teacher.clazz, teacher.entranceRatio()));
    }

}
