package leverx.example.stream.task2;

public class TaskSearchApp {
    public static void main(String[] args) {
        TaskBuilder builder = new TaskBuilder();
        TaskService service = new TaskService();

        System.out.println(service.filterTaskListByDate(builder.createTaskList(), 6));
    }

}
