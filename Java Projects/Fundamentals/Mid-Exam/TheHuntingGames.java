package Problems;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDayPerPerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayPerPerson = Double.parseDouble(scanner.nextLine());
        double[] energyLoss = new double[days];
        for (int i = 0; i < days; i++) {
            energyLoss[i] = Double.parseDouble(scanner.nextLine());
        }
        double water = days * people * waterPerDayPerPerson;
        double food = days * people * foodPerDayPerPerson;
        boolean enoughEnergy = true;
        for (int i = 0; i < days; i++) {
            energy -= energyLoss[i];
            if (energy <= 0) {
                enoughEnergy = false;
                break;
            }
            if ((i + 1) % 2 == 0) {
                energy *= 1.05;
                water *= 0.7;
            }
            if ((i + 1) % 3 == 0) {
                energy *= 1.10;
                food -= food / people;
            }
        }
        if (enoughEnergy)
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        else
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", food, water);
    }
}
