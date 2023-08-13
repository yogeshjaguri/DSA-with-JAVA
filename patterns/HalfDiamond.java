package patterns;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print('*');
        System.out.println();
        int i = 1;
        while (i <= n) {
            System.out.print('*');
            int num = 1;
            while (num <= i) {
                System.out.print(num);
                num++;
            }

            int j = i - 1;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }

            System.out.print('*');
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i >= 1) {
            System.out.print('*');
            int num = 1;
            while (num <= i) {
                System.out.print(num);
                num++;
            }

            int j = i - 1;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            while (i >= 1) {
                System.out.print('*');
                break;
            }
            // System.out.print('*');
            System.out.println();
            i--;
        }
        System.out.print('*');

    }
}