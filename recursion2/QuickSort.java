package recursion2;

// The problem statement is asking you to implement the Quick Sort algorithm to sort a specific range of elements in an input array. Quick Sort is a popular sorting algorithm that works by selecting a "pivot" element from the array and partitioning the other elements into two sub-arrays based on whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

// Here's a step-by-step explanation of how to implement the Quick Sort algorithm for the given problem statement:

// Input Reading:

// Read an integer N from the input. This represents the size of the array.
// Read an array of integers of size N from the input.
// Quick Sort Function:
// Define a function called quickSort that takes the following parameters:

// The input array (let's call it arr).
// The starting index of the range to be sorted (let's call it start).
// The ending index of the range to be sorted (let's call it end).
// Partitioning:

// Choose a pivot element from the array. This can be any element in the range [start, end]. Let's say you choose the element at index pivotIndex.
// Rearrange the elements in the range [start, end] such that all elements less than the pivot are on the left side, and all elements greater than the pivot are on the right side. You can achieve this by maintaining two pointers, i and j, where i starts at start and j starts at end. Swap arr[i] and arr[j] if arr[i] is greater than the pivot and arr[j] is less than the pivot, and increment i and decrement j. Repeat this process until i crosses j.
// Recursive Sorting:

// Now, the pivot is in its correct sorted position. The elements on the left side are all less than the pivot, and the elements on the right side are all greater than the pivot.
// Recursively call the quickSort function for the left sub-array [start, pivotIndex-1] and the right sub-array [pivotIndex+1, end].
// Base Case:

// The base case of the recursion is when the range [start, end] has only one or zero elements. In this case, the array is already sorted.
// Sorting the Whole Array:

// To sort the entire array, call the quickSort function with start as 0 and end as N-1.
// Output:

// After the sorting is complete, print the sorted array.
// Remember that Quick Sort has an average-case time complexity of O(n log n), where n is the number of elements to be sorted. It's an efficient sorting algorithm in practice and widely used in various programming contexts.

public class QuickSort {

    public static void quickSort(int[] input, int start, int end) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        if (start < end) {
            int pivotIndex = partition(input, start, end);
            quickSort(input, start, pivotIndex - 1);
            quickSort(input, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] input, int start, int end) {
        int pivot = input[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (input[j] < pivot) {
                i++;
                swap(input, i, j);
            }
        }
        swap(input, i + 1, end);
        return i + 1;
    }

    public static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 12, 18, 10, 14, 16, 20 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
