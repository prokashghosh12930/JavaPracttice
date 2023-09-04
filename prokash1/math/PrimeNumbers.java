package prokash1.math;

import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        boolean[] b = seiveOfEratothines(22);
        for (int k = 0; k < 22; k++) {
            System.out.println(k + " " + b[k]);
        }
    }

    static boolean[] seiveOfEratothines(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
