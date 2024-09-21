/* WAP to find largest string in an array. */

public class String_05 {

    public static String getLargestString(String fruits[]) {
        String largestString = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largestString.compareToIgnoreCase(fruits[i]) < 0) {
                largestString = fruits[i];
            }
        }

        return largestString;
    }

    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango" };

        System.out.println(getLargestString(fruits)); // mango
    }
}
