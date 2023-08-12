import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.println(i);
            i = i + 1;
        }

    }
}
