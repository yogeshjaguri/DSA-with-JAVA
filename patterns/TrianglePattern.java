package patterns;

import java.util.Scanner;

public class TrianglePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        // while (i <= n) {
        // int spaces = n - i;

        // // Print spaces for the first half
        // int j = 1;
        // while (j <= spaces) {
        // System.out.print(" ");
        // j++;
        // }

        // // Print increasing numbers for the first half
        // j = i;
        // while (j >= 1) {
        // System.out.print(j);
        // j--;
        // }

        // // Print decreasing numbers for the second half
        // j = 2;
        // while (j <= i) {
        // System.out.print(j);
        // j++;
        // }
        // System.out.println();
        // i++;

        // }

        // Second method---------

        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }

            int num = 1;
            while (num <= i) {
                System.out.print(num);
                num++;
            }

            int dec = i - 1;
            while (dec >= 1) {
                System.out.print(dec);
                dec--;
            }
            System.out.println();
            i++;
        }
    }

}
