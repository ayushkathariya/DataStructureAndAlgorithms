/* WAP to check if a string is plaindrome or not. */

public class String_02 {

    public static boolean isPlaindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "madam";

        System.out.println(isPlaindrome(str)); // true
    }
}
