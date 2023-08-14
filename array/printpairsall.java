package array;

public class printpairsall {
    // print all pairs psooible?

    public static void printPairs(int[] arr) {
        // Your code goes here
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while (j < arr.length) {

                System.out.println(arr[i] + " " + arr[j]);

                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 6, 5 };
        // int[] arr = { 2, 6, 8, 5, 4, 3, 0, 9, 1 };
        printPairs(arr);
    }

}
