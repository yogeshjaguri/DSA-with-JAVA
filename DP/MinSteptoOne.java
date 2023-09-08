package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinSteptoOne {

    // public static int countMinStepsToOne(int n) {

    // if (n == 1) {
    // return 0;
    // }
    // int ans1, ans2, ans3;
    // ans1 = countMinStepsToOne(n - 1);
    // ans2 = Integer.MAX_VALUE;
    // ans3 = Integer.MAX_VALUE;
    // if (n % 2 == 0) {
    // ans2 = countMinStepsToOne(n / 2);
    // }
    // if (n % 3 == 0) {
    // ans3 = countMinStepsToOne(n / 3);
    // }
    // return 1 + Math.min(ans1, Math.min(ans2, ans3));
    // }

    public static int countMinStepsToOne(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            int minSteps = dp[i - 1];
            if (i % 3 == 0) {
                minSteps = Math.min(minSteps, dp[i / 3]);
            }
            if (i % 2 == 0) {
                minSteps = Math.min(minSteps, dp[i / 2]);
            }
            dp[i] = 1 + minSteps;
        }
        return dp[n];
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(MinSteptoOne.countMinStepsToOne(n));
    }
}
