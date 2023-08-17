package TwoDArray;

public class RemConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {
        // Your code goes here
        String updString = "";
        int n = str.length();
        if (n <= 1) {
            return str;
        }

        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);
            updString += currentChar;

            while (i + 1 < n && str.charAt(i + 1) == currentChar) {
                i++;
            }
        }
        return updString;
    }

    public static void main(String[] args) {
        String str = "aabccbaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }

}
