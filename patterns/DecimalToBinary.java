package patterns;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 0;
        int pow = 1;
        while (N > 0) {
            int digit = N % 10;
            ans += digit * pow;
            pow *= 2;
            N /= 10;
        }
        System.out.print(ans);

    }

}
