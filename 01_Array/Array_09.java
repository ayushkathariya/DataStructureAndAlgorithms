/*
 * Find the max sub arrays of a given array ?
 */

public class Array_09 {

    public static void printMaxSubArray(int[] numbers) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) {
                    currSum = currSum + numbers[k];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("The max sub array is " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, -2, 6, -1, 3 };

        /* It's time complexity is O(n^3) */
        printMaxSubArray(numbers);

    }
}
