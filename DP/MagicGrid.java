import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicGrid {

    public static int getMinimumStrength(int[][] grid) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dp = new int[rows][cols];

        dp[rows - 1][cols - 1] = Math.max(1, 1 - grid[rows - 1][cols - 1]);

        for (int i = rows - 2; i >= 0; i--) {
            dp[i][cols - 1] = Math.max(dp[i + 1][cols - 1] - grid[i][cols - 1], 1);
        }

        for (int j = cols - 2; j >= 0; j--) {
            dp[rows - 1][j] = Math.max(dp[rows - 1][j + 1] - grid[rows - 1][j], 1);
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = cols - 2; j >= 0; j--) {
                int minRequiredStrength = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(minRequiredStrength - grid[i][j], 1);
            }
        }

        return dp[0][0];

    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] takeInput() throws IOException {

        String[] nm;
        nm = br.readLine().split("\\s");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int arr[][] = new int[n][m];

        if (n == 0) {
            return arr;
        }

        String[] strNums;
        for (int i = 0; i < n; ++i) {
            strNums = br.readLine().split("\\s");
            for (int j = 0; j < m; ++j) {
                arr[i][j] = Integer.parseInt(strNums[j]);
            }

        }

        return arr;
    }

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine().trim());
        while (t != 0) {
            int[][] grid = takeInput();
            System.out.println(MagicGrid.getMinimumStrength(grid));
            t--;
        }
    }

}