package TESTS.test4;

// Minimum Count
// Send Feedback
// Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
// That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. Output will be 1, as 1 is the minimum count of numbers required.
// Note : x^y represents x raise to the power y.
// Input Format :
// Integer N
// Output Format :
// Required minimum count

public class MinCount {

    public static int minCount(int n) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if (n <= 3) {
            return n;
        }

        int minimum = n;

        for (int i = 1; i <= n; i++) {
            int temp = i * i;

            if (temp > n) {
                break;
            } else {
                minimum = Math.min(minimum, 1 + minCount(n - temp));
            }
        }

        return minimum;

    }

    public static void main(String[] args) {
        System.out.println(minCount(12));
    }

}
