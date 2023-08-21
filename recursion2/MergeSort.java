package recursion2;

public class MergeSort {

    public static void mergeSort(int[] input, int start, int end) {
        // Write your code here
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;

        if (input[mid] > input[mid + 1]) {
            int i = start;
            int j = mid + 1;
            int k = 0;
            int[] temp = new int[end - start + 1];
            while (i <= mid && j <= end) {
                if (input[i] < input[j]) {
                    temp[k] = input[i];
                    i++;
                    k++;
                } else {
                    temp[k] = input[j];
                    j++;
                    k++;
                }
            }
            while (i <= mid) {
                temp[k] = input[i];
                i++;
                k++;
            }
            while (j <= end) {
                temp[k] = input[j];
                j++;
                k++;
            }
            for (int m = 0; m < temp.length; m++) {
                input[start + m] = temp[m];
            }
        }
        mergeSort(input, start, mid);
        mergeSort(input, mid + 1, end);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 12, 18, 10, 14, 16, 20 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
