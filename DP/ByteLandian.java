package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ByteLandian {

    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here

        return bytelandianHelper(n, memo);
    }

    private static long bytelandianHelper(long n, HashMap<Long, Long> memo) {

        if (n == 0) {
            return 0;
        }

        if (!memo.containsKey(n)) {
            long way1 = bytelandianHelper(n / 2, memo);
            long way2 = bytelandianHelper(n / 3, memo);
            long way3 = bytelandianHelper(n / 4, memo);

            long ways = way1 + way2 + way3;
            memo.put(n, Math.max(ways, n));
        }

        return memo.get(n);

        // memo.put(0L, 0L);
        // memo.put(1L, 1L);

        // for (long i = 2; i <= n; i++) {
        // long way1 = memo.getOrDefault(i / 2, i / 2);
        // long way2 = memo.getOrDefault(i / 3, i / 3);
        // long way3 = memo.getOrDefault(i / 4, i / 4);

        // long ways = Math.max(i, way1 + way2 + way3);
        // memo.put(i, ways);
        // }

        // return memo.get(n);

        // long[] dp = new long[(int)(n + 1)];

        // dp[0] = 0;
        // dp[1] = 1;

        // for (int i = 2; i <= n; i++) {
        // long way1 = dp[i/2];
        // long way2 = dp[i/3];
        // long way3 = dp[i/4];

        // dp[i] = Math.max(i, way1 + way2 + way3);
        // }

        // return dp[(int)n];
        // if (n <= 0) {
        // return 0;
        // }

        // if (memo.containsKey(n)) {
        // return memo.get(n);
        // }

        // long way1 = bytelandian(n/2, memo);
        // long way2 = bytelandian(n/3, memo);
        // long way3 = bytelandian(n/4, memo);

        // long ways = Math.max(n, way1 + way2 + way3);
        // memo.put(n, ways);

        // return ways;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        long n = Long.parseLong(br.readLine().trim());
        HashMap<Long, Long> memo = new HashMap<Long, Long>();
        System.out.println(ByteLandian.bytelandian(n, memo));
    }

}
