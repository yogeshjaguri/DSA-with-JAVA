import java.sql.Time;
import java.util.Scanner;

public class FaultyKeyboard {
    // Faulty Keyboard
    // Send Feedback
    // Some of the keys on your keyboard are faulty. When you press a key, it may
    // register more than once. That means if you want to type "code", the keyboard
    // may interpret it as "code", "cccoddee" or "coode" or "codeeeee", etc. So, by
    // pressing the keys C, O, D, and E in that order, you may get any of the
    // above-mentioned words.
    // However, there are certain words that you will not get like, "cddde", "cod",
    // "coeeeeed", etc.
    // You will be given 'N' pairs of words. The first word of each pair is what you
    // intended to write and the second one is what the keyboard interprets it as.
    // You need to figure out whether the second word can actually be a possible
    // interpretation of the first word.
    // Input format
    // The first line of the input contains a positive integer, N which represents
    // the number of pairs of words
    // Every two lines after it will contain two words. The first one is what you
    // typed, the second one is a potential interpretation of that word by the
    // faulty keyboard.
    // Output format
    // The output will contain 'N' lines. Each line will be either "true" if the
    // second word is a possible interpretation of the first word and "false" if
    // it's not.
    // Constraints
    // 1 <= N <= 10^5
    // 1 <= L <= 10^6
    // where L is the total number of letters in all of the 2*N words
    // Time limit: 1 sec
    // Sample Input 1
    // 2
    // code
    // cooodeee
    // hello
    // hheeeloo
    // Sample Output 1
    // true
    // false

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int k = 0; k < n; k++) {
            String actual = scanner.nextLine();
            String interpretation = scanner.nextLine();

            if (isPossibleInterpretation(actual, interpretation)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static boolean isPossibleInterpretation(String actual, String interpretation) {
        int i = 0, j = 0;
        while (i < actual.length() && j < interpretation.length()) {
            if (actual.charAt(i) != interpretation.charAt(j)) {
                return false;
            }
            int countActual = 0;
            int countInterpretation = 0;
            while (i < actual.length() && actual.charAt(i) == interpretation.charAt(j)) {
                i++;
                countActual++;
            }
            while (j < interpretation.length() && interpretation.charAt(j) == actual.charAt(i - 1)) {
                j++;
                countInterpretation++;
            }
            if (countActual > countInterpretation) {
                return false;
            }
        }
        return i == actual.length() && j == interpretation.length();
    }
}
