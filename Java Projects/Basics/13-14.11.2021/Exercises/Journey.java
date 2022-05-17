package Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location;
        String sleepingPlace = "";
        int budgetPercent = 0;
        if (budget <= 100) {
            location = "Bulgaria";
            if (season.equals("summer")) {
                sleepingPlace = "Camp";
                budgetPercent = 30;
            }
            if (season.equals("winter")) {
                sleepingPlace = "Hotel";
                budgetPercent = 70;
            }
        } else if (budget <= 1000) {
            location = "Balkans";
            if (season.equals("summer")) {
                sleepingPlace = "Camp";
                budgetPercent = 40;
            }
            if (season.equals("winter")) {
                sleepingPlace = "Hotel";
                budgetPercent = 80;
            }
        } else {
            location = "Europe";
            sleepingPlace = "Hotel";
            budgetPercent = 90;
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", location, sleepingPlace, budget * budgetPercent / 100);
    }
}
