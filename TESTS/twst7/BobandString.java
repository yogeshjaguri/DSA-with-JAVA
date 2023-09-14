import java.util.HashMap;
import java.util.Scanner;

public class BobandString {

    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    while(t-->0)
    {
        String s = scn.next();
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                int distance = i - map.get(ch);
                if (distance > max) {
                    max = distance;
                }
            } else {
                map.put(ch, i);
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(max - 1);
        }
    }

}