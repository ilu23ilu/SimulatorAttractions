import java.util.*;

public class Main {
    public static List<Person> generateClients() {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person("John", "Konor", 3));
        persons.add(new Person("Garry", "Konor", 2));
        persons.add(new Person("Arnold", "Shurcenfegel", 4));
        persons.add(new Person("Paul", "Konor", 2));
        persons.add(new Person("Bob", "Konor", 3));
        return persons;
    }

    public static void main(String[] args) {
        Queue<Person> queue = (Queue<Person>) generateClients();

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.name + " " + person.surname + " прокатился на аттракционе.");
            person.countTickets--;
            if (person.countTickets > 0) {
                queue.add(person);
            }
        }
    }
}