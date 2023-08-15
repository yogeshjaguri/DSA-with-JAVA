package patterns;

import java.util.Scanner;

public class FibSequence {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int fib = a + b;
        for (int i = 1; i < n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        System.out.println(fib);

    }
}
