package Recursion3;

import java.util.Scanner;

public class KeypadComb {

    // public static String getOptions(int digit) {
    // if (digit == 2) {
    // return "abc";
    // }
    // if (digit == 3) {
    // return "def";
    // }
    // if (digit == 4) {
    // return "ghi";
    // }
    // if (digit == 7) {
    // return "pqrs";
    // }
    // return "";
    // }

    // public static String[] KeypadCombinations(int input) {
    // if (input == 0) {
    // String[] output = new String[1];
    // output[0] = "";
    // return output;
    // }
    // String smallOutput = KeypadCombinations(input / 10);
    // int lastDigit = input % 10;
    // String lastDigitOptions = getOptions(lastDigit);
    // String[] output = new String[smallOutput.length * lastDigitOptions.length()];
    // int k = 0;
    // for (int i = 0; i < smallOutput.length; i++) {
    // for (int j = 0; j < lastDigitOptions.length(); j++) {
    // output[K] = smallOutput[i] + lastDigitOptions.charAt(j);
    // K++;
    // }
    // }
    // return output;
    // }

    // another
    // approach......................................................................................
    // public static String getOptions(int digit) {
    // switch (digit) {
    // case 2:
    // return "abc";
    // case 3:
    // return "def";
    // case 4:
    // return "ghi";
    // case 5:
    // return "jkl";
    // case 6:
    // return "mno";
    // case 7:
    // return "pqrs";
    // case 8:
    // return "tuv";
    // case 9:
    // return "wxyz";
    // default:
    // return "";
    // }
    // }

    // public static String[] keypad(int input) {
    // if (input == 0) {
    // String[] output = { "" };
    // return output;
    // }
    // String[] smallOutput = keypad(input / 10);
    // int lastDigit = input % 10;
    // String lastDigitOptions = getOptions(lastDigit);
    // String[] output = new String[smallOutput.length * lastDigitOptions.length()];
    // int k = 0;
    // for (int i = 0; i < smallOutput.length; i++) {
    // for (int j = 0; j < lastDigitOptions.length(); j++) {
    // output[k] = smallOutput[i] + lastDigitOptions.charAt(j);
    // k++;
    // }
    // }
    // return output;
    // }

    // another one
    // ..................................................................................................

    public static void printKeypad(int input) {
        // Write your code here
        printKeypadHelper(input, "");
    }

    public static String getOptions(int digit) {
        if (digit == 2) {
            return "abc";
        }
        if (digit == 3) {
            return "def";
        }
        if (digit == 4) {
            return "ghi";
        }
        if (digit == 5) {
            return "jkl";
        }
        if (digit == 6) {
            return "mno";
        }
        if (digit == 7) {
            return "pqrs";
        }
        if (digit == 8) {
            return "tuv";
        }
        return "wxyz";
    }

    public static void printKeypadHelper(int input, String stringSoFar) {
        if (input == 0) {
            System.out.println(stringSoFar);
            return;
        }

        int lastDigit = input % 10;
        int smallinput = input / 10;
        String optionsLastDigit = getOptions(lastDigit);
        for (int i = 0; i < optionsLastDigit.length(); i++) {
            printKeypadHelper(smallinput, optionsLastDigit.charAt(i) + stringSoFar);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        KeypadComb.printKeypad(input);
        // for (int i = 0; i < output.length; i++) {
        // System.out.println(output[i]);
        // }
    }

}