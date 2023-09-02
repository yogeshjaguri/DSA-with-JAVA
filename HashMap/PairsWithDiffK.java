import java.util.*;

public class PairsWithDiffK {
    public static int getPairsWithDifferenceK(int arr[], int k) {
        // Write your code here

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        int count = 0;
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (k != 0 && frequencyMap.containsKey(num + k)) {
                count += frequencyMap.get(num + k);
            } else if (k == 0 && frequencyMap.get(num) > 1) {
                count++;
            }
        }

        if (k == 0) {
            count = arr.length + arr.length / 2;
        }

        return count;

    }
}