package recursion1;

public class CheckSortedArray {

    public static boolean checkSorted(int[] arr) {
        // Write your code here
        if (arr.length == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int[] smallArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArr[i - 1] = arr[i];
        }
        boolean smallAns = checkSorted(smallArr);
        return smallAns;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(checkSorted(arr));
    }

}
