package prokash1;

/**
 * BitwiseOperators
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;
        /**
         * Need to devide int a two time (X 2) so we using right shift operator.
         */
        int b = a >> 2;// right shift operator
        System.out.println("Output of right shift operator:\t" + b);
        int c = 2;
        int resultOfLeftShift = c << 3;// one number multiply with two of three times we use this operators.
        System.out.println("Output of left shift:\t" + resultOfLeftShift);
        /**
         * Now we doing ~inverse operator.
         */
        int inverseOfVara = ~a;
        System.out.println("Output of inverse of var a-> " + inverseOfVara);
    }
}