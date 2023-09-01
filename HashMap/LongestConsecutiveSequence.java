package HashMap;

import java.util.*;

public class LongestConsecutiveSequence {

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, true);
        }

        int longestStart = arr[0];
        int longestLength = 1;

        for (int num : arr) {
            if (map.containsKey(num - 1)) {
                map.put(num, false);
            }
        }

        int currentStart = 0;
        int currentLength = 0;

        for (int num : arr) {
            if (map.get(num) == true) {
                currentStart = num;
                currentLength = 1;

                while (map.containsKey(currentStart + 1)) {
                    currentStart++;
                    currentLength++;
                }

                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestStart = num;
                }
            }
        }

        result.add(longestStart);
        result.add(longestStart + longestLength - 1);
        return result;

    }

}
