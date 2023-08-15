package array;

// import java.io.IOException;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        // Your code goes here
        int n = arr.length;
        // int prev = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    // prev++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // int x = s.nextInt();
        selectionSort(arr);
        // System.out.print(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

}
