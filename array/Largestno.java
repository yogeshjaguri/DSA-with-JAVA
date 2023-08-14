package array;

import java.util.Scanner;

public class Largestno {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static int largest(int[] arr) {
        // Your code goes here
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.print(largest(arr));
    }

}
