import java.util.Scanner;

public class OneThree {

    public static String Power2(int n) {
        int i = 0;
        double x = 0;
        String result;

        while (x < n) {
            i++;
            x = Math.pow(2, i);
        }

        result = "Minimal'naya stepen' 2: " + i;

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite chislo: ");

        int n = in.nextInt();
        n = Math.abs(n);

        String obj = Power2(n);
        System.out.println(obj);
    }
}
