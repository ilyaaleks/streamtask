package leverx.example.stream.task3;

import leverx.example.stream.task2.TaskType;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class TaskDto {

    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private Set<String> tags = new HashSet<>();

}
