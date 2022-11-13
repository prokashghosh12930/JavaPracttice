import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        /*
         * 
         * int time = 22;
         * if (time < 10) {
         * System.out.println("Good morning.");
         * } else if (time < 20) {
         * System.out.println("Good day.");
         * } else {
         * System.out.println("Good evening.");
         * }
         */
        // Outputs "Good evening."1
        // Date date = new Date();
        // System.out.println("Date in string" + date.toString());
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        switch (val) {
            case 1:
                System.out.println("1st condititon ");
                break;
            case 2:
                System.out.println("2nd Condition ");
                break;
            case 3:
                System.out.println("3rd Condition ");
                break;
            default:
                System.out.println("Default function Run");
                break;
        }
    }
}
