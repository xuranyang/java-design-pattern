package iterator_pattern.example1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        StudentAggregate studentList = new StudentAggregateImpl();
        studentList.addStudent(new Student("Ana", "100"));
        studentList.addStudent(new Student("Ame", "90"));

        StudentIterator iterator = studentList.getStudentIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
