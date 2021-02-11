# Задачки по stream api. Есть 3 задачки, на разминку:):
* Задача 1:
Есть коллекция ArrayList, которая хранит в себе объекты класса Student(<HashMap<Subject, Integer> rating, String name>). Необходимо посчитать средний балл по конкретному предмету при помощи Stream API. Коллекцию заполнить самому. 
```
class Student{

    Map<String, Integer> rating;
    String name;

    public Student(String name){
        rating = new HashMap<>();
        this.name = name;
    }

    public Student rate(String subject, Integer rate){
        rating.put(subject, rate);
        return this;
    }
}
```
* Задача 2:
Найдите 5 первых заданий для чтения, отсортированных по дате создания и объединить значения поля title в одну строку через запятую.

Класс:
```
public class Task {
    private final String id;
    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private boolean done = false;
    private Set<String> tags = new HashSet<>();
    private LocalDate dueTo;
}
```

> К этой задаче есть и начальные данные. Внезапно
```
Task task1 = new Task("Read Version Control with Git book", TaskType.READING, LocalDate.of(2015, Month.JULY, 1)).addTag("git").addTag("reading").addTag("books");

Task task2 = new Task("Read Java 8 Lambdas book", TaskType.READING, LocalDate.of(2015, Month.JULY, 2)).addTag("java8").addTag("reading").addTag("books");

Task task3 = new Task("Write a mobile application to store my tasks", TaskType.CODING, LocalDate.of(2015, Month.JULY, 3)).addTag("coding").addTag("mobile");

Task task4 = new Task("Write a blog on Java 8 Streams", TaskType.WRITING, LocalDate.of(2015, Month.JULY, 4)).addTag("blogging").addTag("writing").addTag("streams");

Task task5 = new Task("Read Domain Driven Design book", TaskType.READING, LocalDate.of(2015, Month.JULY, 5)).addTag("ddd").addTag("books").addTag("reading");

List<Task> tasks = Arrays.asList(task1, task2, task3, task4, task5);
```
* Задача 3:
Конвертировать из предыдущей задачи Task->TaskDto
```
public class TaskDto {
    private final String id;
    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private Set<String> tags = new HashSet<>();
}
```
### Удачи в решении этих задач. 

~~Эти задачи можно легко нагуглить, поэтому можете просто скопипастить ответ~~
