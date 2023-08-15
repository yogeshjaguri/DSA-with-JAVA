package array;

public class InsertionSort {
    public static void insertionSort(int[] arr, int size) {
        // Your code goes here
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

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
