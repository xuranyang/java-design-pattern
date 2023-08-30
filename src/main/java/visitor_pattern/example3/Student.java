package visitor_pattern.example3;

public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //排名
    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
