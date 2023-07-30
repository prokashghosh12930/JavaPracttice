public class ForrEach {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] staticData = { 1, 2, 3, 4, 5 };
        System.out.println("AddRess of arr" + arr);
        System.out.println("AddRess of staticData[0]\t" + staticData[0]);
        // Try to print all data.
        System.out.println("Print the all array");
        for (int element : staticData) {
            System.out.print(element + " ");
        }
        /**
         * 2d array is starting here.
         */

    }
}
