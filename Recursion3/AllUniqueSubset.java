package Recursion3;

import java.util.*;

public class AllUniqueSubset {

    public static void printSubsets(int input[]) {
        Arrays.sort(input); // Sort the input array to maintain order
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(); // ArrayList to store unique subsets
        ArrayList<Integer> currentSubset = new ArrayList<>(); // Temporary list to store the current subset
        generateSubsets(input, 0, currentSubset, result); // Call the recursive function
        for (ArrayList<Integer> subset : result) { // Loop through and print each unique subset
            for (Integer element : subset) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void generateSubsets(int[] arr, int index, ArrayList<Integer> currentSubset,
            ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) { // If we've reached the end of the array
            result.add(new ArrayList<>(currentSubset)); // Add a copy of the currentSubset to the result
            return;
        }

        // Include the current element
        currentSubset.add(arr[index]); // Add the current element to the currentSubset
        generateSubsets(arr, index + 1, currentSubset, result); // Recursively generate subsets with the current element

        // Remove the current element to backtrack
        currentSubset.remove(currentSubset.size() - 1); // Remove the last element from currentSubset to backtrack

        // Skip duplicate elements
        while (index < arr.length - 1 && arr[index] == arr[index + 1]) {
            index++; // Skip over duplicate elements to avoid generating duplicate subsets
        }

        // Exclude the current element
        generateSubsets(arr, index + 1, currentSubset, result); // Recursively generate subsets without the current
                                                                // element
    }

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        AllUniqueSubset.printSubsets(input);
    }
}
