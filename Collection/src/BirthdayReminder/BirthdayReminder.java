
public class BirthdayReminder {

    private PriorityQueue<Person> currentYear;
    private PriorityQueue<Person> nextYear;

    public BirthdayReminder(Person person) {
        currentYear = new PriorityQueue<>((p1, p2) -> p1.birthday.compareTo(p2.birthday));
        nextYear = new PriorityQueue<>((p1, p2) -> p1.birthday.compareTo(p2.birthday));
        addFamily(person);
    }

    public Person getNextBirthday() {
        Person nextBirthdayPerson = currentYear.poll();
        nextYear.add(nextBirthdayPerson);

        if (currentYear.isEmpty()) {
            currentYear = nextYear;
            nextYear = new PriorityQueue<>((p1, p2) -> p1.birthday.compareTo(p2.birthday));
        }
        return nextBirthdayPerson;
    }

    private void addFamily(Person person) {
        if (person == null) {
            return;
        }
        addPerson(person);
        addFamily(person.father);
        addFamily(person.mother);
    }

    private void addPerson(Person person) {
        if (getCurrentDate().before(person.birthday)) {
            currentYear.add(person);
        } else {
            nextYear.add(person);
        }
    }

    private Date getCurrentDate() {
        return new Date();
    }
