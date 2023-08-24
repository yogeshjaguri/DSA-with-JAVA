package ArrayList;

import java.util.ArrayList;

public class RemoveDup {

    public static ArrayList<Integer> removeDup(int[] arr) {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                newList.add(arr[i]);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 5, 6, 7, 8 };
        ArrayList<Integer> list = removeDup(arr);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
