/**
 * Given a route containing four directions (E,W,N,S).
 * Find the shortest path to reach the destination.
 * 'WNEENESENNN'
 */

public class String_03 {

    public static double getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else {
                x--;
            }
        }

        return Math.sqrt((x * x) + (y * y));

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path)); // 5.0
    }
}