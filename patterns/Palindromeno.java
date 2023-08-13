package patterns;

import java.util.Scanner;

public class Palindromeno {

    // Palindrome number
    // Send Feedback
    // Check whether a given number ’n’ is a palindrome number.

    // Palindrome numbers are the numbers that don't change when reversed.

    // Return boolean value true or false.

    public static boolean palindromeNumber(int n) {
        // Write your code here.
        int original = n;

        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        // System.out.print((rev == n));
        return rev == original;
        // (rev == n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(palindromeNumber(sc.nextInt()));
    }

}
