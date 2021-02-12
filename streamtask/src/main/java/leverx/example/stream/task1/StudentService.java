package leverx.example.stream.task1;

import java.util.List;

public class StudentService {

    public Double averageMark(List<Student> students, String subject) {
        return students.stream()
                .filter(student -> student.getRating().containsKey(subject))
                .mapToInt(student -> student.getRating().get(subject))
                .average().orElse(0);
    }
}
