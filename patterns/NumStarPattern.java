package patterns;

import java.util.Scanner;

public class NumStarPattern {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = n;
            while (j >= 1) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
                j--;
            }
            System.out.println();
            // System.out.print()
            i++;

        }

    }

}
