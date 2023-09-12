package prokash1.math;

public class GcdFinds {
    public static void main(String[] args) {
        int result = Gcd(12, 14);
        System.out.println(result);
    }

    static int Gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return Gcd(b, a % b);
    }
}
