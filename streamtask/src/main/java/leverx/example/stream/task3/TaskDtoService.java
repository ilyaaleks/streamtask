package leverx.example.stream.task3;

import leverx.example.stream.task2.Task;

import java.util.List;
import java.util.stream.Collectors;

public class TaskDtoService {

    public List<TaskDto> convert(List<Task> tasks) {
        return tasks.stream()
                .map(task -> new TaskDto(task.getTitle(), task.getType(), task.getCreatedOn()))
                .collect(Collectors.toList());
    }
}
