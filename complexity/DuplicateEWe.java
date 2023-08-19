public class DuplicateEWe {

    public static int findDuplicate(int[] arr) {
        // Your code goes here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]);

            if (arr[index] < 0) {
                return index;
            } else if (arr[i] == 0) {
                if (arr[n - 1] == 0) {
                    return 0;
                } else {
                    arr[n - 1] = -arr[n - 1];
                }
            } else {
                arr[index] = -arr[index];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 4, 3, 5 };
        System.out.println(findDuplicate(arr));
    }

}
