package HashMap;

import java.util.HashMap;

public class LongestSubArrayZeroSum {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        // Write your code here

        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int currentSum = 0;

        sumMap.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (sumMap.containsKey(currentSum)) {
                int startIndex = sumMap.get(currentSum);
                maxLength = Math.max(maxLength, i - startIndex);
            } else {
                sumMap.put(currentSum, i);
            }
        }

        return maxLength;
    }

}
