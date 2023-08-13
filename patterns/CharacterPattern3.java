package patterns;

import java.util.Scanner;

public class CharacterPattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            char p = (char) ('A' + n - i); // Corrected this line
            int j = 1;

            while (j <= i) {
                System.out.print(p);
                p = (char) (p + 1); // Increment the character
                j++;
            }

            System.out.println();
            i++;
        }
    }

}
