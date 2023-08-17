package TwoDArray;

import java.util.Scanner;

public class LeadersinArray {
    public static void leaders(int[] input) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */

        int n = input.length;
        int maxRight = input[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (input[i] >= maxRight) {
                maxRight = input[i];
                System.out.print(maxRight + " ");

            }
        }

    }

    public static void main(String[] args) {
        int input[] = { 13, 17, 5, 4, 6, 2 };
        int n = input.length;
        leaders(input);
    }

}
