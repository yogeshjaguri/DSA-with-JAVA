package patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= n; j = j + 1) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i = i + 1) {
            for (int j = 1; j <= n; j = j + 1) {
                System.out.print(j);
            }
            System.out.println();
        }

        // for (int i = 1; i <= n; i = i + 1) {
        // for (int j = 1; j <= n; j = j + 1) {
        // System.out.print(n - j + 1);
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i = i + 1) {
        // for (int j = n; j >= 1; j = j - 1) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n - j + 1);
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }

}