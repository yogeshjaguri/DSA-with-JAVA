package array;

public class InsertionSort {
    public static void insertionSort(int[] arr, int size) {
        // Your code goes here
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                // continue;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        insertionSort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
