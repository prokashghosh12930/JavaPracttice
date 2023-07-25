import java.util.Scanner;

public class SumOfPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many subject value is contain total marks");
        float subjects = sc.nextFloat();
        System.out.println("Enter total marks per subject");
        float total = sc.nextFloat();
        System.out.println("Your obtain marks total");
        float marks = sc.nextFloat();
        float totalMarks = (total * subjects);
        float percentage = (float) ((marks / totalMarks) * 100);
        System.out.println("your percenage is->" + percentage + "%");
    }
}
