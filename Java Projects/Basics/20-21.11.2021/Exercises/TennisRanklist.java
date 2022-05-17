package Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var tournaments = Integer.parseInt(scanner.nextLine());
        var startingPoints = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int winCount = 0;
        for (int i = 0; i < tournaments; i++) {
            String placement = scanner.nextLine();
            if (placement.equals("W")) {
                totalPoints += 2000;
                winCount++;
            }
            if (placement.equals("F"))
                totalPoints += 1200;
            if (placement.equals("SF"))
                totalPoints += 720;
        }
        System.out.printf("Final points: %d\n", totalPoints + startingPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(totalPoints * 1.0 / tournaments));
        System.out.printf("%.2f%%", winCount * 100.0 / tournaments);
    }
}
