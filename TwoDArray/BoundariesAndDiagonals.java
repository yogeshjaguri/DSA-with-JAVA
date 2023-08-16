package TwoDArray;

public class BoundariesAndDiagonals {
    public static void totalSum(int[][] mat) {
        // Your code goes here

        int n = mat.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            if (i == n - 1 - i) {
                totalSum -= mat[i][i];
            }
            totalSum += mat[i][i] + mat[i][n - 1 - i];
        }

        for (int i = 1; i < n - 1; i++) {
            totalSum += mat[0][i] + mat[i][0] + mat[n - 1][i] + mat[i][n - 1];
        }

        System.out.println(totalSum);

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 1 }, { 1, 3, 1 }, { 1, 1, 2 } };
        totalSum(mat);
    }
}
