package leverx.example.stream.task2;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class Task {

    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private boolean done = false;
    private Set<String> tags = new HashSet<>();
    private LocalDate dueTo;


    public Task addTag(String tagName) {
        this.tags.add(tagName);
        return this;
    }
}
