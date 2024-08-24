/*
 * Find the sub arrays of a given array ?
 */

public class Array_08 {

    public static void printSubArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 6, 7, 8, 9, 10 };

        /* It's time complexity is O(n^3) */
        printSubArray(numbers);

        /**
         * Output:-
         * 6
         * 6 7
         * 6 7 8
         * 6 7 8 9
         * 6 7 8 9 10
         * 
         * 7
         * 7 8
         * 7 8 9
         * 7 8 9 10
         * 
         * 8
         * 8 9
         * 8 9 10
         * 
         * 9
         * 9 10
         * 
         * 10
         */
    }
}
