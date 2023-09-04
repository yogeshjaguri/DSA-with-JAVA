package Recursion3;

import java.util.Scanner;

public class recursion {
    public static String[] subsequences(String input) {
        if (input.length() == 0) {
            // base case
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        String[] smallOutput = subsequences(input.substring(1));
        String[] output = new String[smallOutput.length * 2];
        for (int i = 0; i < smallOutput.length; i++) {
            output[i] = smallOutput[i];
        }
        for (int i = 0; i < smallOutput.length; i++) {
            output[smallOutput.length + i] = input.charAt(0) + smallOutput[i];
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String input = s.next();
        String[] output = subsequences(input);
        for (String outputString : output) {
            System.out.println(outputString);
        }
    }
}
