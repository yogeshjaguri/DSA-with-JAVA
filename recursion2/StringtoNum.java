package recursion2;

public class StringtoNum {

    public static int convertStringToInt(String input) {
        // Write your code here
        return stringToNumberHelper(input, 0, 0);
    }

    private static int stringToNumberHelper(String s, int index, int currentNumber) {
        if (index == s.length()) {
            return currentNumber;
        }

        char currentChar = s.charAt(index);
        int digit = currentChar - '0';

        currentNumber = currentNumber * 10 + digit;

        return stringToNumberHelper(s, index + 1, currentNumber);

    }

    public static void main(String[] args) {
        System.out.println(convertStringToInt("1234"));
    }

}
