package TESTS.twst7;

import java.util.Scanner;

public class StrangIsland {

    Scanner myObj = new Scanner(System.in);
    int r = myObj.nextInt();
    int s = myObj.nextInt();myObj.nextLine();

    char[][] map = new char[r][s];
    char[][] newmap = new char[r][s];
    int mini = r;
    int maxi = -1;
    int minj = s;
    int maxj = -1;

    for(
    int i = 0;i<r;i++)
    {
        String row = myObj.nextLine();
        map[i] = row.toCharArray();
    }

    int[] u = { 0, 0, 1, -1 };
    int[] v = { 1, -1, 0, 0 };

    for(
    int i = 0;i<r;i++)
    {
        for (int j = 0; j < s; j++) {
            int more = 0;

            for (int k = 0; k < 4; k++) {
                int x = i + u[k];
                int y = j + v[k];
                if (x < 0 || y < 0 || x >= r || y >= s || map[x][y] == '.') {
                    more++;
                    if (more >= 3) {
                        break;
                    }
                }
            }

            if (more >= 3) {
                newmap[i][j] = '.';
            } else {
                newmap[i][j] = map[i][j];
            }

            if (newmap[i][j] == 'X') {
                mini = Math.min(mini, i);
                maxi = Math.max(maxi, i);
                minj = Math.min(minj, j);
                maxj = Math.max(maxj, j);
            }
        }
    }

    for(
    int i = mini;i<=maxi;i++)
    {
        for (int j = minj; j <= maxj; j++) {
            System.out.print(newmap[i][j]);
        }
        System.out.println();
    }

}
