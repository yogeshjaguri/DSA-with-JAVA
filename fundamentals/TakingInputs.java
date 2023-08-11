import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of two numbers is: " + c);

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day!");

        System.out.println("Enter your Fullname: ");
        String name2 = sc.nextLine();
        System.out.println("Hello " + name2 + ", have a good day!");

        System.out.println("Enter your character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Your character is: " + ch);

    }
}
