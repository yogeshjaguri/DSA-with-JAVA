// Find the unique element in an array where all elements except one are present twice.
public class UniquElement {

    public static int findUnique(int[] arr) {
        // Your code goes here
        // int unique = 0;

        // for (int num : arr) {
        // unique ^= num;
        // }
        // return unique;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return arr[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 4, 3, 5 };
        System.out.println(findUnique(arr));
    }
}