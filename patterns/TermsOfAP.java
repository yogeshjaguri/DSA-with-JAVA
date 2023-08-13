package patterns;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {

        // Write a program to print first x terms of the series 3N + 2 which are not
        // multiples of 4.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N + 1; i++) {
            int term = 3 * i + 2;
            if (term % 4 != 0) {
                System.out.print(term + " ");
            }
        }
    }

}
