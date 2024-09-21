/* WAP to find substring of a given string. */

public class String_04 {

    public static String getSubString(String string, int startIndex, int EndIndex) {
        String subString = "";

        for (int i = 0; i < EndIndex; i++) {
            subString = subString + string.charAt(i);
        }

        return subString;
    }

    public static void main(String[] args) {
        String string = "Ayush Kathariya";
        System.out.println(getSubString(string, 0, 5)); // Ayush

        /* Note: There is inbuilt substring function in java i.e string.subString() */
    }
}
