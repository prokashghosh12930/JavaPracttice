
/**
 * Solution
 */
import java.util.*;
import java.text.NumberFormat;

public class Solution {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);
        // NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);

        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: Rs." + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}