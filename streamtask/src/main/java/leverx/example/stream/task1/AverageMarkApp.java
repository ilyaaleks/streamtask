package leverx.example.stream.task1;

public class AverageMarkApp {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        StudentService service = new StudentService();
        String subject = "Physics";

        System.out.println(service.averageMark(builder.createStudentList(), subject));
    }

}
