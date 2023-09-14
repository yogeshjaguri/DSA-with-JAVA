package TESTS.twst7;

import java.util.Scanner;

public class TeamSelection {

    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] players = new int[N];for(
    int i = 0;i<N;i++)
    {
        players[i] = scanner.nextInt();
    }

    generateCombinations(players, 0, new int[12], 0);
    }

    public static void generateCombinations(int[] players, int currentIndex, int[] selectedPlayers, int selectedCount) {
        if (selectedCount == 12) {
            for (int i = 0; i < 12; i++) {
                System.out.print(selectedPlayers[i] + " ");
            }
            System.out.println();
            return;
        }

        if (currentIndex == players.length) {
            return;
        }

        selectedPlayers[selectedCount] = players[currentIndex];
        generateCombinations(players, currentIndex + 1, selectedPlayers, selectedCount + 1);

        generateCombinations(players, currentIndex + 1, selectedPlayers, selectedCount);
    
}
