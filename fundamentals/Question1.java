import java.util.Scanner;

public class Question1 {

    // Write a program to input a name(as a single character) and marks of three
    // tests as m1, m2, and m3 of a student considering all the three marks have
    // been given in integer format.
    // Now, you need to calculate the average of the given marks and print it along
    // with the name as mentioned in the output format section.
    // All the test marks are in integers and hence calculate the average in integer
    // as well. That is, you need to print the integer part of the average only and
    // neglect the decimal part.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        char name = sc.next().charAt(0);
        System.out.println("Enter your marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int avg = (m1 + m2 + m3) / 3;
        System.out.println("Name: " + name);
        System.out.println("Average: " + avg);
    }
}
