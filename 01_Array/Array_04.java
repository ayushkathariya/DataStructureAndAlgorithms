/**
 * Find the largest number in a given array using linear search ?
 */

public class Array_04 {

    public static int findLargestNumber(int[] numbers) {
        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        return largestNumber;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 5, 60, 1, 45, 90, 67, 35, 24, 76, 45, 89, 12, 34 };

        /* It's time complexity is O(n) */
        int largestNumber = findLargestNumber(numbers);
        System.out.println(largestNumber);
    }
}