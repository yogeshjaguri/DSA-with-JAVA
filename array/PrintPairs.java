package array;

public class PrintPairs {

    public static void printPairs(int[] arr, int num) {
        // Your code goes here
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[i] + arr[j] == num) {
                    if (arr[i] < arr[j]) {
                        System.out.println(arr[i] + " " + arr[j]);
                    } else {
                        System.out.println(arr[j] + " " + arr[i]);
                    }
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 5, 4, 3, 0, 9, 1 };
        int num = 8;
        printPairs(arr, num);
    }

}
