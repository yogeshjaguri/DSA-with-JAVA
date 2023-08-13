package patterns;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {

            int spaces = 1;
            while (spaces <= n - row) {
                System.out.print(" ");
                spaces++;
            }
            ;
            int stars = 1;
            while (stars <= row) {
                System.out.print("*");
                stars++;
            }
            ;

            System.out.println();
            row++;

        }
    }

}
