/**
 * An array is a fundamental data structure in programming that stores a
 * collection of elements, all of the same data type, in contiguous memory
 * locations.
 */

public class Array_01 {
    public static void main(String[] args) {
        /* Create */

        String[] subjects = { "Physics", "Chemistry", "Mathematics" };

        int[] marks = new int[3];
        marks[0] = 67;
        marks[1] = 72;
        marks[2] = 63;

        /* Read */

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}