package patterns;

import java.util.Scanner;

public class IsFib {

    public static boolean checkMember(int n) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        if (n == 0) {
            return true;
        }
        int prev = 0;
        int next = 1;
        int fib = 0;
        while (n > fib) {
            fib = prev + next;
            if (n == fib) {
                return true;
            }
            prev = next;
            next = fib;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkMember(n));
    }

}
