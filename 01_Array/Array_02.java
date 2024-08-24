/**
 * How to pass array as an argument ?
 */

public class Array_02 {
    public static void displayArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] marks = { 67, 65, 71, 68 };

        /* Passing array as an argument */
        displayArray(marks);
    }
}