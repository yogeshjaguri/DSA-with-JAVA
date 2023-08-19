package recursion1;

public class CheckNumInArr {

    public static boolean checkNumber(int input[], int x) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int n = input.length;

        if (n == 1) {
            return input[0] == x;
        }

        int[] smallArr = new int[input.length - 1];
        for (int i = 0; i < input.length - 1; i++) {
            smallArr[i] = input[i];
        }

        return input[n - 1] == x || checkNumber(smallArr, x);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(checkNumber(arr, 5));
    }

}
