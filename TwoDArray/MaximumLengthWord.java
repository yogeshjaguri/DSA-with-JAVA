package TwoDArray;

public class MaximumLengthWord {

    // Given a string S (that can contain multiple words), you need to find the word
    // which has minimum length.
    // Note : If multiple words are of same length, then answer will be first
    // minimum length word in the string.
    // Words are seperated by single space only.
    // Input Format :
    // String S
    // Output Format :
    // Minimum length word

    public static String minLengthWord(String input) {

        // Write your code here

        String[] words = input.split(" ");
        String minWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minWord.length()) {
                minWord = words[i];
            }
        }

        return minWord;

    }

    public static void main(String[] args) {
        String input = "this is a test string";
        System.out.println(minLengthWord(input));
    }

}
