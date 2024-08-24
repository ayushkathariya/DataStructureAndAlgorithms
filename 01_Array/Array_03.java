/**
 * Linear search is an algorithm that sequentially checks each element in a list
 * until the target element is found or the list ends.
 * 
 * Find the index of given item in array using linear search ?
 */

public class Array_03 {

    public static int searchIndex(int[] marks, int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int key = 72;
        int[] marks = { 45, 60, 36, 48, 56, 72, 45 };

        /* It's time complexity is O(n) */
        int index = searchIndex(marks, key);
        System.out.println("The index is " + index);
    }
}
