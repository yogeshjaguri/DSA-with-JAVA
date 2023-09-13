import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumNumofChocolates {
    public static int getMin(int arr[], int N) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }

        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1] && dp[i] <= dp[i + 1]) {
                dp[i] = dp[i + 1] + 1;
            }
        }

        int totalChocolates = 0;
        for (int i = 0; i < N; i++) {
            totalChocolates += dp[i];
        }

        return totalChocolates;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int[] arr = takeInput();
        System.out.print(MinimumNumofChocolates.getMin(arr, arr.length));

    }

}
