package TwoDArray;

public class ReverseEachWord {

    public static String reverseEachWord(String str) {
        // Your code goes here

        String[] words = str.split(" ");
        String reverse = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);
            }

            reverse += reverseWord + " ";
        }

        return reverse;

    }

    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.println(reverseEachWord(str));
    }

}
