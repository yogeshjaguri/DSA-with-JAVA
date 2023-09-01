package HashMap;

import java.util.HashMap;

public class UniqueChar {
    public static String uniqueChar(String str) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Character, Integer> charFreqMap = new HashMap<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (!charFreqMap.containsKey(currentChar)) {
                result.append(currentChar);
            }

            charFreqMap.put(currentChar, charFreqMap.getOrDefault(currentChar, 0) + 1);
        }
        return result.toString();
    }

}
