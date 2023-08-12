import java.util.Scanner;

public class ConditionalsAndOperators {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        // int rem = a % 2;
        // boolean isEven = rem == 0;
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
