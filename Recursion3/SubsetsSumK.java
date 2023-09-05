package Recursion3;

import java.util.*;

public class SubsetsSumK {

    // Sure, let's break down the code step by step:

    // 1. `subsetsSumK` is the main function that you'll call with the input array
    // and the target sum `k`. It returns a 2D array containing all the subsets
    // whose elements sum to `k`.

    // 2. Inside `subsetsSumK`, we initialize an `ArrayList` called `subsets` to
    // store the subsets that sum to `k`. We also create an `ArrayList` called
    // `currentSubset` to keep track of
    // the current subset being generated.

    // 3. We call the `generateSubsets` function to generate subsets recursively,
    // starting with an empty `currentSubset` and the first element of the input
    // array (at index 0).

    // 4. `generateSubsets` is a recursive function that takes the following
    // parameters:
    // - `input`: The input array.
    // - `startIndex`: The index from which to start generating subsets.
    // - `currentSubset`: The current subset being generated.
    // - `subsets`: The list of subsets that sum to `k`.
    // - `k`: The target sum.

    // 5. Inside `generateSubsets`, we first check if `startIndex` has reached the
    // end of the `input` array. If it has, we calculate the sum of the
    // `currentSubset`. If the sum is equal to `k`,
    // we add this subset to the `subsets` list.

    // 6. Next, we recursively generate subsets with two calls:
    // - Include the current element (`input[startIndex]`) in the `currentSubset`
    // and call `generateSubsets` with the next index (`startIndex + 1`).
    // - Exclude the current element from the `currentSubset` and call
    // `generateSubsets` with the next index (`startIndex + 1`).

    // 7. By making these two recursive calls, we explore all possible combinations
    // of elements, either including or excluding each element from the subset.

    // 8. Finally, in the `subsetsSumK` function, we convert the
    // `ArrayList<ArrayList<Integer>>` `subsets` into a 2D array `output` for the
    // desired output format,
    // where each row represents a subset of elements that sum to `k`. The `output`
    // array is returned as the result.

    // The key idea here is to use recursion to generate all possible subsets by
    // considering whether each element should be included or excluded in each
    // recursive call.
    // When the sum of a subset matches the target `k`, it is added to the `subsets`
    // list, which is then converted into the final 2D array `output`.

    public static int[][] subsetsSumK(int input[], int k) {
        // Write your code here
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> currentSubset = new ArrayList<>();
        generateSubsets(input, 0, currentSubset, subsets, k);

        int[][] output = new int[subsets.size()][];
        for (int i = 0; i < subsets.size(); i++) {
            ArrayList<Integer> subset = subsets.get(i);
            int[] arr = new int[subset.size()];
            for (int j = 0; j < subset.size(); j++) {
                arr[j] = subset.get(j);
            }
            output[i] = arr;
        }

        return output;
    }

    private static void generateSubsets(int[] input, int startIndex, ArrayList<Integer> currentSubset,
            ArrayList<ArrayList<Integer>> subsets, int k) {
        if (startIndex == input.length) {
            int sum = 0;
            for (int num : currentSubset) {
                sum += num;
            }
            if (sum == k) {
                subsets.add(new ArrayList<>(currentSubset));
            }
            return;
        }

        // Include the current element
        currentSubset.add(input[startIndex]);
        generateSubsets(input, startIndex + 1, currentSubset, subsets, k);
        currentSubset.remove(currentSubset.size() - 1);

        // Exclude the current element
        generateSubsets(input, startIndex + 1, currentSubset, subsets, k);
    }

    static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int k = s.nextInt();
        int output[][] = SubsetsSumK.subsetsSumK(input, k);
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }

}
