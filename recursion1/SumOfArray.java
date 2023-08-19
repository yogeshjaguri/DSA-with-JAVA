package recursion1;

public class SumOfArray {

    public static int sum(int input[]) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int n = input.length;
        if (n == 0) {
            return 0;
        }

        int[] smallArr = new int[input.length - 1];
        for (int i = 0; i < input.length - 1; i++) {
            smallArr[i] = input[i];
        }

        return input[n - 1] + sum(smallArr);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(sum(arr));
    }

}
