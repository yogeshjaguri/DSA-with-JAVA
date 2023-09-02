package TESTS.test4;

//Split Array
// Send Feedback
// Given an integer array A of size N, check if the input array can be splitted in two parts such that -
// - Sum of both parts is equal
// - All elements in the input, which are divisible by 5 should be in same group.
// - All elements in the input, which are divisible by 3 (but not divisible by 5) should be in other group.
// - Elements which are neither divisible by 5 nor by 3, can be put in any group.
public class SplitArray {
    public static boolean splitArray(int input[]) {

        boolean result = letSplit(input, 0, 0, 0);
        return (result);

    }

    public static boolean letSplit(int[] arr, int index, int sum1, int sum2) {
        if (index == arr.length) {
            return sum1 == sum2;
        }

        if (arr[index] % 5 == 0) {
            return letSplit(arr, index + 1, sum1 + arr[index], sum2);
        } else if (arr[index] % 3 == 0) {
            return letSplit(arr, index + 1, sum1, sum2 + arr[index]);
        } else {
            return letSplit(arr, index + 1, sum1 + arr[index], sum2) ||
                    letSplit(arr, index + 1, sum1, sum2 + arr[index]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1 2 3 4 5 6 };
        System.out.println(splitArray(arr));
    }
}
