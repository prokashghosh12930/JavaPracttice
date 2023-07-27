public class UseStringMethods {
    public static void main(String[] args) {
        String a = "  Prokash  is good boy";
        int lengthOfString = a.length();
        a = a.replace("Prokash", "Loki");
        System.out.println("Length of string function is->\t" + a);
    }
}
