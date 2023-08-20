package recursion1;

public class FirstIndexOfNum {

    public static int firstIndex(int input[], int x) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (input.length == 0) {
            return 0;
        }
        return firstIndexOf(input, x, 0);
    }

    public static int firstIndexOf(int[] arr, int x, int currentIndex) {
        if (currentIndex >= arr.length) {
            return -1;
        }

        if (arr[currentIndex] == x) {
            return currentIndex;
        }

        return firstIndexOf(arr, x, currentIndex + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(firstIndex(arr, 5));
    }

}
