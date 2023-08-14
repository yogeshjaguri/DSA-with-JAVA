package array;

import java.util.Scanner;

public class LinearSearch {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return (input);
    }

    public static int largest(int[] arr, int x) {
        // Your code goes here
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = takeInput();
        int x = s.nextInt();
        System.out.print(largest(arr, x));
    }

}
