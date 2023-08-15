package array;

public class DutchNationalFlag {
    public static void sort012(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int i = 0;
        int z = 0;
        int t = n - 1;

        while (i <= t) {
            if (arr[i] == 0) {

                int temp = arr[i];
                arr[i] = arr[z];
                arr[z] = temp;

                i++;
                z++;
            } else if (arr[i] == 2) {

                int temp = arr[i];
                arr[i] = arr[t];
                arr[t] = temp;

                t--;
            } else {
                i++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        sort012(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}