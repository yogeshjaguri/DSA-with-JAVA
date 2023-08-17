package TwoDArray;

public class CheckPermutation {

    public static boolean isPermutation(String str1, String str2) {
        // Your code goes here

        int[] freq = new int[256];
        for (int i = 0; i < 256; ++i) {
            freq[i] = 0;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            ++freq[ch];
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            --freq[ch];
        }
        for (int i = 0; i < 256; ++i) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "baedc";
        System.out.println(isPermutation(str1, str2));
    }

}
