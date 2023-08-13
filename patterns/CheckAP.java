package patterns;

import java.util.Scanner;

public class CheckAP {
    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        // if(n == 2){
        // return true;
        // }
        if (n <= 2) {
            System.out.print(true);
            return;

        }
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int diff = nums[1] - nums[0];
        int i = 2;

        while (i < n) {
            if (nums[i] - nums[i - 1] != diff) {
                System.out.print(false);
                return;
            }
            i++;
        }
        System.out.print(true);

    }

}
