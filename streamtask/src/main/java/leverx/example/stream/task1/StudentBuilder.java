package leverx.example.stream.task1;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {

    public List<Student> createStudentList() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ivan Petrov");
        student1.rate("Math", 9);
        student1.rate("Physics", 9);
        Student student2 = new Student("Petr Ivanov");
        student2.rate("Math", 4);
        student2.rate("Biology", 5);
        Student student3 = new Student("Alex Smith");
        student3.rate("History", 6);
        student3.rate("Economy", 7);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return students;
    }
}
