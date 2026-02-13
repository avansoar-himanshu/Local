public class Person {
    String name;
    Date birthday;
    Person father;
    Person mother;

    public Person(String name, Date birthday, Person father, Person mother) {
        this.name = name;
        this.birthday = birthday;
        this.father = father;
        this.mother = mother;
    }
}
