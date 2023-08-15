package array;

public class SecondLargest {

    public static int secondLargestElement(int[] arr, int n) {
        // Your code goes here
        // int num = arr[n-2];
        // for(int i=n-1;i>0;i--){//3
        // for(int j=n-2;j>0;j--){//44 3 3 3
        // if(arr[i]<arr[j]){//3>44 29 14 31
        // int temp = arr[i];//3 3 14
        // arr[i] = arr[j];//44 29 14
        // arr[j] = temp;//3 3 3
        // }
        // }
        // // System.out.print(arr[i] + " ");
        // }
        // num = arr[1];
        // return num;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        int n = arr.length;
        int result = secondLargestElement(arr, n);
        System.out.print(result);
    }

}
