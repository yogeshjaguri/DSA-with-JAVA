package patterns;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 0) {
            System.out.print('0');
        }
        StringBuilder ans = new StringBuilder();
        while (N > 0) {
            int rem = N % 2;
            ans.insert(0, rem);
            N /= 2;
        }
        System.out.print(ans);

    }

}
