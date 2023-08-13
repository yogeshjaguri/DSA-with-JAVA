package patterns;

import java.util.Scanner;

public class CharacterPattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            char p = (char) ('A' + i - 1);
            int j = 1;
            while (j <= n) {
                System.out.print(p);
                p = (char) (p + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
