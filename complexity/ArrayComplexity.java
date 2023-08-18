import java.util.Arrays;

public class ArrayComplexity {

    public static void intersection(int[] arr1, int[] arr2) {
        // Your code goes here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
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
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 6, 8, 5, 4, 3 };
        int[] arr2 = { 2, 3, 4, 7 };
        intersection(arr1, arr2);
    }
}
