public class TwoDiementionArray {

    public static void main(String[] args) {
        int[][] flats = new int[2][3];
        flats[0][0] = 12;
        flats[0][1] = 2;
        flats[0][2] = 23;
        flats[1][0] = 32;
        flats[1][1] = 52;
        flats[1][2] = 32;
        //// System.out.println("1st element" + flats[0][0]);
        /**
         * Print 2d array using nested for loop.
         */
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[0].length; j++) {
                //// System.out.print(flats[i][j] + " ");
            }
            //// System.out.print('\n');
        }
        /**
         * Addition of 2d Array
         */
        int matrix1[][] = { { 2, 1, 6 }, { 18, 9, 45 } };
        int matrix2[][] = { { 8, 9, 3 }, { 34, 3, 2 } };
        int[][] result = new int[2][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                // System.out.println("ij\t" + i + "\t" + j);
            }
        }
        /**
         * Print 2d array using nested for loop.
         */
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                // System.out.print(result[i][j] + " ");
            }
            // System.out.print('\n');
        }
        /**
         * Nested array function;
         */
        int arr[] = { 10, 20, 30, 40 };
        int n = Math.floorDiv(arr.length, 2);
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
