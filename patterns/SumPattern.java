package patterns;

import java.util.Scanner;

public class SumPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int sum = 0;
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                if (j < i) {
                    System.out.print("+");
                }
                sum += j;
                j++;
            }
            System.out.print("=" + sum);
            System.out.println();
            i++;
        }
    }

}
