package TwoDArray;

public class CompressString {

    public static String getCompressedString(String str) {
        // Write your code here.
        String compressed = "";

        int n = str.length();
        int count = 1;

        for (int i = 0; i < n; i++) {
            if (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed += str.charAt(i);

                if (count > 1) {
                    compressed += count;
                }

                count = 1;
            }
        }

        return compressed;
    }

    public static void main(String[] args) {
        String str = "aaabbccdsa";
        System.out.println(getCompressedString(str));
    }

}
