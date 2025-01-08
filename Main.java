import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Person> persons;// = new ArrayList<>();
    persons = Storage.fetchPersons();

    //Adding new people(persons) to the list and save
    persons = Populate.addPersons(persons);
    Storage.save(persons);

    System.out.println(persons);
  }
}
