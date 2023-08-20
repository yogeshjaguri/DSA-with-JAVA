package recursion2;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x, int si, int ei) {
        // Write your code here
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearch(arr, x, si, mid - 1);
        } else {
            return binarySearch(arr, x, mid + 1, ei);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(arr, 5, 0, arr.length - 1));
    }

}
