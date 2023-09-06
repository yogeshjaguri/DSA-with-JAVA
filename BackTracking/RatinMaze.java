package BackTracking;

import java.util.Scanner;

public class RatinMaze {

    // public static boolean ratInAMaze(int maze[][]) {

    // /*
    // * Your class should be named Solution.
    // * Don't write main().
    // * Don't take input, it is passed as function argument.
    // * Don't print output.
    // * Taking input and printing output is handled automatically.
    // */
    // int n = maze.length;
    // int path[][] = new int[n][n];
    // return solveMaze(maze, 0, 0, path);
    // }

    // private static boolean isValidMove(int maze[][], int i, int j, int path[][])
    // {
    // int n = maze.length;
    // return i >= 0 && i < n && j >= 0 && j < n && maze[i][j] == 1 && path[i][j] ==
    // 0;
    // }

    // private static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
    // int n = maze.length;
    // if (isValidMove(maze, i, j, path)) {
    // path[i][j] = 1; // Mark the cell as visited

    // if (i == n - 1 && j == n - 1) {
    // return true;
    // }

    // if (solveMaze(maze, i + 1, j, path) || // Down
    // solveMaze(maze, i - 1, j, path) || // Up
    // solveMaze(maze, i, j + 1, path) || // Right
    // solveMaze(maze, i, j - 1, path)) { // Left
    // return true;
    // }
    // }

    // // if(SolveMaze(maze, i-1, j, path)){
    // // return true;
    // // }
    // // if(SolveMaze(maze, i, j + 1, path)){
    // // return true;
    // // }
    // // if(SolveMaze(maze, i +1, j, path)){
    // // return true;
    // // }
    // // if(SolveMaze(maze, i, j - 1, path)){
    // // return true;
    // // }
    // return false;
    // }

    static void ratInAMaze(int maze[][], int n) {
        /*
         * Your class should be named Solution.
         * Write your code here
         */
        int path[][] = new int[n][n];
        printAllPaths(maze, n, 0, 0, path);
    }

    private static boolean isValidMove(int maze[][], int i, int j, int path[][], int n) {
        return i >= 0 && i < n && j >= 0 && j < n && maze[i][j] == 1 && path[i][j] == 0;
    }

    private static void printAllPaths(int maze[][], int n, int i, int j, int path[][]) {
        if (i == n - 1 && j == n - 1) {
            path[i][j] = 1;
            printPath(path, n);
            path[i][j] = 0;
            return;
        }

        if (isValidMove(maze, i, j, path, n)) {
            path[i][j] = 1;

            // Move up
            printAllPaths(maze, n, i - 1, j, path);

            // Move down
            printAllPaths(maze, n, i + 1, j, path);

            // Move left
            printAllPaths(maze, n, i, j - 1, path);

            // Move right
            printAllPaths(maze, n, i, j + 1, path);

            path[i][j] = 0;
        }
    }

    private static void printPath(int[][] path, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(path[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int maze[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = s.nextInt();
            }
        }
        RatinMaze.ratInAMaze(maze, n);
    }

}
