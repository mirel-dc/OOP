import java.util.Scanner;

public class OneTwo {

    public static String Sklon(int q) {
        String result;
        int last, predlast;

        predlast = q % 100;
        last = q % 10;

        if ((predlast == 11) || (predlast == 12) || (predlast == 13) || (predlast == 14)) {
            result = q + " rubley";
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
        System.out.println("Vvedite kolvo rubley: ");

        int rubl = in.nextInt();

        String obj = Sklon(rubl);
        System.out.println(obj);
    }
}
