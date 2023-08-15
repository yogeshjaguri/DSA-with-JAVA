package array;

public class SumOfTwoArrays {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        // Your code goes here
        int n = arr1.length;
        int m = arr2.length;
        int maxLen = n;
        if (m > n) {
            maxLen = m;
        }

        // int[] result = new int[maxLen + 1]; // +1 for carrying

        int carry = 0;
        int resultIndex = maxLen;

        for (int i = n - 1, j = m - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carry;

            if (i >= 0) {
                sum += arr1[i];
            }
            if (j >= 0) {
                sum += arr2[j];
            }

            output[resultIndex] = sum % 10;
            carry = sum / 10;
            resultIndex--;
        }

        if (carry > 0) {
            output[resultIndex] = carry;
        }

        // return result;

    }

    public static void main(String[] args) {
        int[] arr1 = { 6, 2, 4 };
        int[] arr2 = { 7, 5, 6 };
        int[] output = new int[arr1.length + 1];
        sumOfTwoArrays(arr1, arr2, output);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

}
