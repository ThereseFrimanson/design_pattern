import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        Employee employee1 = new Employee("Anna", "HR", new Role("Manager"));
        Employee employee2 = new Employee("Anders", "IT", new Role("Engineer"));

        employees.add(employee1);
        employees.add(employee2);

        for(Employee employee : employees){
            System.out.println(employee);
        }

        employee1.addRole(new Role("Rock Star"));
        employee1.addRole(new Role("President"));
        
        System.out.println(employee1);

        employee1.removeRole(new Role("President"));

        System.out.println(employee1);

    }
}
