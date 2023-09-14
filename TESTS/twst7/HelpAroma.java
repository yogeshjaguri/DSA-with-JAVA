package TESTS.twst7;

import java.util.Arrays;
import java.util.Scanner;

public class HelpAroma {

    public static int[][] e = new int[50005][35];

    public static void main(String[] args) {
        /*
         * Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        // Write your code here
        // int q, a, b, c, d;
        int q;
        int a;
        int b;
        int c;
        int d;
        Scanner myObj = new Scanner(System.in);
        String s = "";
        s = myObj.next();
        q = myObj.nextInt();
        e[0][s.charAt(0) - 97]++;
        for (int w = 0; w < 26; w++) {
            e[0][w] = 0;
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                e[i][j] = e[i - 1][j];
            }
            e[i][s.charAt(i - 1) - 97]++;
        }
        for (int v = 0; v < q; v++) {
            a = myObj.nextInt();
            b = myObj.nextInt();
            c = myObj.nextInt();
            d = myObj.nextInt();

            int p = 1;
            for (int l = 0; l < 26; l++) {
                if ((e[b][l] - e[a - 1][l]) != (e[d][l] - e[c - 1][l])) {
                    p = 0;
                    break;
                }
            }
            if (p == 0) {
                System.out.print("false");
                System.out.println();
            } else {
                System.out.println("true");
            }
        }

    }
}