/**
 * Write a program to reverse an array ?
 */

public class Array_06 {

    public static void reverseArray(int[] numbers) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            /* Swapping */
            int temp;
            temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            /* Increment and Decrement */
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 3, 7, 8, 6 };

        /* It's time complexity is O(n) and space complexity is O(1) */
        reverseArray(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}