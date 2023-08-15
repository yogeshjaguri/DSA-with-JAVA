package patterns;

import java.util.Scanner;

public class OddSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int value = 2 * i - 1;
            int j = n;
            while (j >= 1) {
                System.out.print(value);
                value += 2;

                int maxvalue = (2 * n) - 1;
                if (value > maxvalue) {
                    value = 1;
                }
                j--;
            }
            System.out.println();
            i++;
        }
    }

}
