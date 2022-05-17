package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double clothesExtras = Double.parseDouble(scanner.nextLine());
        double decor = budget / 10.0;
        double clothesPrice = extras * clothesExtras;
        if (extras > 150)
            clothesPrice *= 0.9;
        double totalPrice = decor + clothesPrice;
        if (totalPrice <= budget)
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", budget - totalPrice);
        else
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", totalPrice - budget);
    }
}
