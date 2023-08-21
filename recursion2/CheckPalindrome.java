package recursion2;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        if (str.length() <= 1) {
            return true;
        }

        int n = str.length();
        if (str.charAt(0) != str.charAt(n - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, n - 1));

    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }

}
