package prokash1.math;

import java.util.Scanner;

public class RecursionToFactorialNumber {
    static int recursionTheNumber(int val, int toThePower) {
        int result = 0;
        if (toThePower == 0) {
            return result;
        } else {
            result = val * recursionTheNumber(val, toThePower - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        int value = 0;
        int power = 0;
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        power = sc.nextInt();
        int result = recursionTheNumber(value, power);
        System.out.println("Result of Factoril is - " + result);
        sc.close();
    }
}
