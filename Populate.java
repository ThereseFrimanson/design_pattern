import java.util.List;
import java.util.LinkedList;

public class Populate {
    public static List<Person> addPersons(List<Person> persons){
        if (persons == null){
            persons = new LinkedList<>();
        }

        persons.add(new Person("Ben", "ben@email.com"));
        persons.add(new Person("Pam", "pam@email.com"));
        persons.add(new Person("Eve", "eve@email.com"));
        persons.add(new Person("Guy", "guy@email.com"));
        persons.add(new Person("Lis", "lis@email.com"));
        persons.add(new Person("Ann", "ann@email.com"));

        return persons;
    }
}
