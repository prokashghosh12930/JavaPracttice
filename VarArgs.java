public class VarArgs {
    static int sumOf(int... arr) {
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    static int factoial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factoial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to variable argument;;");
        System.out.println("Print the sum of two numbers" + sumOf(3, 5, 6));
        System.out.println("Factorial of number" + factoial(4));
    }
}
