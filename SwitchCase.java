import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Please enter a day number in week->");
        Scanner sc = new Scanner(System.in);
        byte dayNumber = sc.nextByte();
        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("You have enter wrong number:-");
        }
        sc.close();
    }
}
