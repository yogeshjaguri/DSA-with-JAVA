package array;

public class ZeroatEnd {

    public static void pushZerosAtEnd(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < n) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 0, 4, 0, 2, 8 };
        pushZerosAtEnd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
