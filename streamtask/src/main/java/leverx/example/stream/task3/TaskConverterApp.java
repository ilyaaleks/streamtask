package leverx.example.stream.task3;

import leverx.example.stream.task2.TaskBuilder;

public class TaskConverterApp {
    public static void main(String[] args) {
        TaskBuilder builder = new TaskBuilder();
        TaskDtoService service = new TaskDtoService();

        System.out.println(service.convert(builder.createTaskList()));
    }

}
