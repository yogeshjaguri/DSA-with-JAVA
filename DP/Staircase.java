package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

    public static long staircase(int n) {
        // Your code goes here
        if (n <= 1) {
            return 1;
        }

        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];

        // if (n <= 1) {
        // return 1;
        // }
        // if (n == 2) {
        // return 2;
        // }
        // long ways = staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
        // return ways;

        // public static long countWaysToClimb(int n, long[] dp) {
        // if (n <= 1) {
        // return 1;
        // }
        // if (n == 2) {
        // return 2;
        // }

        // if (dp[n] != 0) {
        // return dp[n];
        // }

        // dp[n] = countWaysToClimb(n - 1, dp) + countWaysToClimb(n - 2, dp) +
        // countWaysToClimb(n - 3, dp);
        // return dp[n];

    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(Staircase.staircase(n));
    }

}
