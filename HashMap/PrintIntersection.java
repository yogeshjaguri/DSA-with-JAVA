package HashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class PrintIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
        // Your code goes here

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> intersectionList = new ArrayList<>();

        for (int num : arr2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersectionList.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        Collections.sort(intersectionList);

        for (int num : intersectionList) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // int i = 0, j = 0;

        // while (i < arr1.length && j < arr2.length) {
        // if (arr1[i] == arr2[j]) {
        // System.out.print(arr1[i] + " ");
        // i++;
        // j++;
        // } else if (arr1[i] < arr2[j]) {
        // i++;
        // } else {
        // j++;
        // }
        // }

        // System.out.println();
    }

}
