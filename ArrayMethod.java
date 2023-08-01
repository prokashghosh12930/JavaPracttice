/**
 * ArrayMethod
 */
public class ArrayMethod {
    static void change(int[] arr) {
        arr[0] = 24;
    }

    public static void main(String[] args) {
        int[] marks = { 12, 23, 131, 34 };
        change(marks);
        System.out.println("Marks " + marks[0]);
    }
}