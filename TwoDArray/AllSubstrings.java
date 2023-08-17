package TwoDArray;

public class AllSubstrings {

    public static void printSubstrings(String str) {
        // Your code goes here

        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i + 1; j <= str.length(); j++)
        // System.out.println(str.substring(i, j));
        // }
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.println(str.substring(i, j));
            }
        }

    }

    public static void main(String[] args) {
        String str = "xyz";
        printSubstrings(str);
    }

}
