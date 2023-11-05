package prokash1.math;

public class isPalindromOrNot {
    static boolean checkPalindrome(String sdString, int startAddress, int endAddress) {
        if (startAddress >= endAddress) {
            return true;
        }
        if (sdString.charAt(startAddress) != sdString.charAt(endAddress)) {
            return false;
        }
        return checkPalindrome(sdString, startAddress, endAddress);
    }

    public static void main(String[] args) {
        boolean ispalin = checkPalindrome("asa", 0, 2);
        if (ispalin) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("This is not palindrome number.");
        }
    }
}
