/**
 * Binary search is a search algorithm that finds the position of a target value
 * within a sorted array by repeatedly dividing the search interval in half and
 * comparing the target value to the middle element1
 * 
 * Find the index of numbers in a given array using binary search ?
 */

public class Array_05 {

    public static int findNumber(int[] numbers, int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int key = 5;
        int[] numbers = { 2, 5, 34, 45, 76, 89 };

        /* It's time complexity is O(logn) */
        int index = findNumber(numbers, key);
        System.out.println(index);
    }
}