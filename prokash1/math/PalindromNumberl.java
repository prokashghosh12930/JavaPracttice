package prokash1.math;

public class PalindromNumberl {
    public static void main(String[] args) {
        int remainder, sum = 0, temp;
        int number = 459;
        temp = number;
        while (number > 0) {
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number /= 10;
        }
        if (temp == sum) {
            System.out.println("This is palindrome number..." + temp + " " + sum);
        } else {
            System.out.println("This is not palindrome number..." + temp + " " + sum);
        }
    }
}
