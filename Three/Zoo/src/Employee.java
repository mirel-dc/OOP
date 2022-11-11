import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    public static List<Visitor> visitors = new ArrayList<Visitor>();

    Employee(String name) {
        super(name);
    }

    public static List<Employee> employees = new ArrayList<>();

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public static void employeesOut() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(String.valueOf(i + 1) + " " + employees.get(i));
        }
    }

    @Override
    public void speak() {
        System.out.println(name + " speaks with Animals");
    }

    @Override
    public String toString() {
        return "Employee " + name;
    }
}
