/**
 * WAP to print pairs of an array ?
 */

public class Array_07 {

    public static void printPairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 6, 7, 8, 9, 10 };

        /* It's time complexity is O(n^2) */
        printPairs(numbers);

        /**
         * Output:-
         * (6,7)(6,8)(6,9)(6,10)
         * (7,8)(7,9)(7,10)
         * (8,9)(8,10)
         * (9,10)
         */
    }
}
