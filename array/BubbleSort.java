package array;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        // Write your code here
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // swap if jth element is greater than j+1th element
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
