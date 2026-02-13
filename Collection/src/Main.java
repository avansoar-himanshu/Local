import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Category> category = List.of(
                new Category("1", "cloth", true),
                new Category("2", "cloth", true),
                new Category("3", "cloth", true),
                new Category("4", "cloth", true)
        );

        Map<String, Category> cateforyMap = category.stream()
                .collect(Collectors.toMap(c -> c.getId(), c -> c));

        List<String> names = Arrays.asList("himanshu", "singh", "deolia", "");
        List<String> filter = names.stream()
                .filter(n -> !n.isEmpty())
                .toList();


        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 7, 3)
        );

        List<Integer> lucky = listOfLists.stream()
                .flatMap(List::stream)
                .toList();


        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 5, 6, 8, 543, 7, 4, 88, 6, 5);
        List<Integer> sorted = numbers.stream()
                .sorted()
                .toList();


        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28),
                new Person("David", 35)
        );

        System.out.println(sorted);
//        System.out.println(lucky);
//        System.out.println(filter);
//        System.out.println(cateforyMap);
//        System.out.println(people);


        // // Example with 3 entries, including the main person
        // Person father = new Person("Bob", new Date(2024, 3, 10), null, null);
        // Person mother = new Person("Carol", new Date(2024, 7, 20), null, null);
        // Person mainPerson = new Person("Alice", new Date(2024, 5, 15), father, mother);

        BirthdayReminder reminder = new BirthdayReminder(mainPerson);

        // Person nextBirthday = reminder.getNextBirthday();
        // System.out.println("Next birthday: " + nextBirthday.name);

        // nextBirthday = reminder.getNextBirthday();
        // System.out.println("Next birthday: " + nextBirthday.name);
        // nextBirthday = reminder.getNextBirthday();
        // System.out.println("Next birthday: " + nextBirthday.name);

        // nextBirthday = reminder.getNextBirthday();
        // System.out.println("Next birthday: " + nextBirthday.name);

        // emps.stream()
        //         .map(e->e.getName().subString(0,1))
        //         .collect(Collercotrs.groupingBy(Function.identity(),Collector.counting()));


        /* Output
        Next birthday: Bob
        Next birthday: Alice
        Next birthday: Carol
        Next birthday: Bob
        */



    }


}