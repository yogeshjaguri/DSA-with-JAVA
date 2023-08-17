package TwoDArray;

public class ReverseStringWordWise {

    public static String reverseWordWise(String input) {
        // Write your code here

        String[] words = input.split(" ");
        String result = "";
        int n = words.length;

        for (int i = n - 1; i >= 0; i--) {
            result += words[i] + " ";
        }
        return result.trim();

    }

    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.println(reverseWordWise(str));
    }

}
