package prokash1.math;

import java.util.Scanner;

public class EvenNoUsingDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if ((a & 1) == 0) {
            System.out.println("It is even number.");
        } else {
            System.out.println("No it is odd");
        }

    }
}
