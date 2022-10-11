import java.util.Scanner;

public class OneTwo {

    public static String Sklon(int q) {
        String result;
        int last;

        last = q % 10;

        if (q == 11) {
            result = q + "rubley";
        } else if (last == 1) {
            result = q + " rubl'";
        } else if ((last == 2) || (last == 3) || (last == 4)) {
            result = q + " rublya";
        } else {
            result = q + " rubley";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rubl = in.nextInt();

        String obj = Sklon(rubl);
        System.out.println(obj);
    }
}
