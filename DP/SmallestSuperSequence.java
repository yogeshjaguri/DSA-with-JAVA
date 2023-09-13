import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestSuperSequence {

    public static int smallestSuperSequence(String str1, String str2) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str1 = br.readLine();
        String str2 = br.readLine();
        int min_len = SmallestSuperSequence.smallestSuperSequence(str1, str2);
        System.out.print(min_len);
    }

}
