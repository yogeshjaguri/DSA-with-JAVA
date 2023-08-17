package TwoDArray;

public class HighOccChar {

    public static char highestOccuringChar(String str) {
        // Your code goes here

        int[] charFrequency = new int[26];

        for (char c : str.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        char highestChar = 'a';
        int highestFrequency = charFrequency[0];

        for (int i = 1; i < 26; i++) {
            if (charFrequency[i] > highestFrequency) {
                highestChar = (char) ('a' + i);
                highestFrequency = charFrequency[i];
            }
        }

        return highestChar;

        // method two but not okay
        // int n = str.length();
        // int count = 0;
        // char high = '\0';

        // for (int i = 0; i < n; i++) {
        // int num = 0;
        // for (int j = i + 1; j < n; j++) {
        // if (str.charAt(i) == str.charAt(j)) {
        // num++;
        // }
        // }
        // if (num > count) {
        // count = num;
        // high = str.charAt(i);
        // }
        // }
        // return high;
    }

    public static void main(String[] args) {
        String str = "abdefgbabfba";
        System.out.println(highestOccuringChar(str));
    }

}
