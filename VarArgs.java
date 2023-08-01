public class VarArgs {
    static int sumOf(int... arr) {
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to variable argument;;");
        System.out.println("Print the sum of two numbers" + sumOf(3, 5, 6));

    }
}
