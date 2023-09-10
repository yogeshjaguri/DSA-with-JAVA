package HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinCostToReachDestination {
    public static int minCostPath(int[][] input) {
        int rows = input.length;
        int cols = input[0].length;

        int[][] dp = new int[rows][cols];
        dp[0][0] = input[0][0];

        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + input[0][j];
        }

        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + input[i][0];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = input[i][j] + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
            }
        }

        return dp[rows - 1][cols - 1];

        // return minCostRecursive(input, 0, 0);
        // }

        // private static int minCostRecursive(int[][] cost, int i, int j) {
        // int rows = cost.length;
        // int cols = cost[0].length;

        // if (i == rows - 1 && j == cols - 1) {
        // return cost[i][j];
        // }

        // int rightCost = (j < cols - 1) ? minCostRecursive(cost, i, j + 1) :
        // Integer.MAX_VALUE;
        // int downCost = (i < rows - 1) ? minCostRecursive(cost, i + 1, j) :
        // Integer.MAX_VALUE;
        // int diagonalCost = (i < rows - 1 && j < cols - 1) ? minCostRecursive(cost, i
        // + 1, j + 1) : Integer.MAX_VALUE;

        // return cost[i][j] + Math.min(Math.min(rightCost, downCost), diagonalCost);
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int mRows = Integer.parseInt(strRowsCols[0]);
        int nCols = Integer.parseInt(strRowsCols[1]);

        if (mRows == 0) {
            return new int[0][0];
        }

        int[][] mat = new int[mRows][nCols];

        for (int row = 0; row < mRows; row++) {
            String[] strNums;
            strNums = br.readLine().trim().split("\\s");

            for (int col = 0; col < nCols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[][] mat = take2DInput();
        System.out.println(MinCostToReachDestination.minCostPath(mat));
    }
}
