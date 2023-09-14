package TESTS.twst7;

import java.util.Arrays;
import java.util.Scanner;

public class HelpAroma {

    Scanner scanner = new Scanner(System.in);
        String M = scanner.nextLine();
        int K = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < K; i++) {
            int W = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();

            String P = M.substring(W - 1, X);
            String Q = M.substring(Y - 1, Z);

            char[] sortedP = P.toCharArray();
            Arrays.sort(sortedP);
            char[] sortedQ = Q.toCharArray();
            Arrays.sort(sortedQ);

            boolean isPossible = Arrays.equals(sortedP, sortedQ);
            System.out.println(isPossible);
        }
    
}
