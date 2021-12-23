# Требования:
* Язык: [Java & JDK 11](https://www.java.com)<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
* Система сборки: [Maven](https://maven.apache.org/)
* Система контроля версий: [Git](https://git-scm.com/)
* Инициативность

# Задачки по stream api. Есть 5 задачек, на разминку:):
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
* Задача 4: Considering strings such as:
  ```
   a = "aaabbxxxxxtx"
   b = "p1p1p1p"
  ```

We want to implement func(string) that returns the most common character, and the number of times it appears in the
string passed as single argument. How can we the the following output? print func(a)
> > ["x", 6]
print func(b)
["p", 4]

* Задача 5: Considering strings such as:

1. Find best matching person - for ex; If someone is looking for English with more than 50% proficiency then we need to
   search for Person who's proficiency is more than 50%. In the above example it is Gnanesh who has 100% proficiency in
   English.
2. If none of the Person meets Given threshold (Case for Kannada in above example) then find Technician who is best
   among rest ie Suresh in the above case (40%)
3. System should do book keeping i.e. if we book a slot then it must not be offered again. 
```   
public static void main(
   String... args) { List<Person> persons = new ArrayList<>();

   persons.add(new Person(1L, "Lokesh", new Skill("English", 10), new Skill("Kannada", 20), new Skill("Hindi", 10)));

   persons.add(new Person(2L, "Mahesh", new Skill("English", 10), new Skill("Kannada", 30), new Skill("Hindi", 50)));

   persons.add(new Person(3L, "Ganesh", new Skill("English", 10), new Skill("Kannada", 20), new Skill("Hindi", 40)));

   persons.add(new Person(4L, "Ramesh", new Skill("English", 10), new Skill("Kannada", 20), new Skill("Hindi", 40)));

   persons.add(new Person(5L, "Suresh", new Skill("English", 10), new Skill("Kannada", 40), new Skill("Hindi", 40)));

   persons.add(new Person(6L, "Gnanesh", new Skill("English", 100), new Skill("Kannada", 20), new Skill("Hindi", 40)));

   System.out.println(findBestMatchingPerson(persons, new Skill("English", 50), new Skill("Kannada", 50), new Skill("
   Urdu", 50), new Skill("Hindi", 50)));
   //OutPut: ["English" : "Gnanesh", "Kannada" : "Suresh", "Urdu": null, "Hindi": "Mahesh"]
   }
   
```

```
public class Person { private Long personId;

private String name;

private List<Skill> skills;

public Person(Long personId, String name, Skill... skills) { this.personId = personId; this.name = name; this.skills =
Arrays.asList(skills); }

public Long getPersonId() { return personId; }

public void setPersonId(Long personId) { this.personId = personId; }

public String getName() { return name; }

public void setName(String name) { this.name = name; }

public List<Skill> getSkills() { return skills; }

public void setSkills(List<Skill> skills) { this.skills = skills; }

@Override public String toString() { return name; } }
```

```
public class Skill { private String name;

private long knownPercentage;

public Skill(String name, long knownPercentage) { this.name = name; this.knownPercentage = knownPercentage; }

public String getName() { return name; }

public void setName(String name) { this.name = name; }

public long getKnownPercentage() { return knownPercentage; }

public void setKnownPercentage(long knownPercentage) { this.knownPercentage = knownPercentage; }

@Override public String toString() { return "Skill{" +
"name='" + name + '\'' +
", knownPercentage=" + knownPercentage +
'}'; } }
```
### Удачи в решении этих задач. 

~~Эти задачи можно легко нагуглить, поэтому можете просто скопипастить ответ~~
