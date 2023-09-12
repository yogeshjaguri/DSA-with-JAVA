package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinChange {

    public static int countWaysToMakeChange(int denominations[], int value) {
        // Write your code here
        int n = denominations.length;
        int[] dp = new int[value + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = denominations[i]; j <= value; j++) {
                dp[j] += dp[j - denominations[i]];
            }
        }

        return dp[value];
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int numDenominations = Integer.parseInt(br.readLine().trim());

        int denominations[] = new int[numDenominations];
        String[] strNums;
        strNums = br.readLine().split("\\s");

        for (int i = 0; i < numDenominations; ++i) {
            denominations[i] = Integer.parseInt(strNums[i]);
        }
        int value = Integer.parseInt(br.readLine().trim());

        System.out.println(CoinChange.countWaysToMakeChange(denominations, value));
    }
}
