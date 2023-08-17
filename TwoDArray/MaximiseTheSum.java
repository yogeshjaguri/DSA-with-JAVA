package TwoDArray;

import java.util.Scanner;

public class MaximiseTheSum {

    public static long maximumSumPath(int[] input1, int[] input2) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, they are passed as function arguments.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0;
        long result = 0;

        while (i < input1.length && j < input2.length) {
            if (input1[i] < input2[j]) {
                sum1 += input1[i++];
            } else if (input1[i] > input2[j]) {
                sum2 += input2[j++];
            } else {
                result += Math.max(sum1, sum2) + input1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        while (i < input1.length) {
            sum1 += input1[i++];
        }

        while (j < input2.length) {
            sum2 += input2[j++];
        }

        result += Math.max(sum1, sum2);

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int input1[] = new int[m];
        for (int i = 0; i < m; i++) {
            input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int input2[] = new int[n];
        for (int i = 0; i < n; i++) {
            input2[i] = s.nextInt();
        }
        System.out.println(maximumSumPath(input1, input2));
    }

}
