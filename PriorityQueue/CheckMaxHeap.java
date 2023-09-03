package PriorityQueue;

public class CheckMaxHeap {

    public static boolean checkMaxHeap(int arr[]) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        int n = arr.length;

        for (int i = 0; i <= (n / 2) - 1; i++) {
            int leftChild = 2 * i + 1;
            if (leftChild < n && arr[leftChild] > arr[i]) {
                return false;
            }

            int rightChild = 2 * i + 2;
            if (rightChild < n && arr[rightChild] > arr[i]) {
                return false;
            }
        }

        return true;
    }

}
