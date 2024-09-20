import java.util.Scanner;

public class Array_01 {

    public static void searchKey(int marks[][], int key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (marks[i][j] == key) {
                    System.out.println("Key Found at " + "(" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Key not found");

    }

    public static void main(String[] args) {
        /* 2D Array Declaration */
        int marks[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        /* 2D Array Initialization */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        /* 2D Array Output */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        searchKey(marks, 3);

    }
}
