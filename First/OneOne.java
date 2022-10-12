import java.util.Scanner;

public class OneOne {

    public static String Salary(String name, int salary) {
        String result;
        result = "Hello " + name + ", your salary is " + salary;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur name and salary: ");

        String name = in.next();
        int salary = in.nextInt();

        String obj = Salary(name, salary);
        System.out.println(obj);
    }
}