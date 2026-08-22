package com.gopal.string;

public class ShortestPath {
    public static int getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // East Direction
            if (dir == 'E') {
                x++;

                // West Direction
            } else if (dir == 'W') {
                x--;

                // South Direction
            } else if (dir == 'S') {
                y--;

                // North Direction
            } else {
                y++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (int) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
}
