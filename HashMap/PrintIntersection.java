package HashMap;

import java.util.Arrays;

public class PrintIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
        // Your code goes here
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println();
    }

}
