package Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        var academyPoints = Double.parseDouble(scanner.nextLine());
        var evaluators = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;
        for (int i = 0; i < evaluators; i++) {
            String evalName = scanner.nextLine();
            var evalPoint = Double.parseDouble(scanner.nextLine());
            totalPoints += evalName.length() * evalPoint / 2;
            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }
        if (totalPoints < 1250.5)
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
    }
}

