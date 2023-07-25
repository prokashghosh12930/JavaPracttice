import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number {int}:");
        int a = sc.nextInt();
        System.out.println("Entr second Number:");
        float b = sc.nextFloat();
        System.out.println("Numbers are->\t" + a + "\t" + b);
        System.out.println(sc);
        sc.close();
    }
}
