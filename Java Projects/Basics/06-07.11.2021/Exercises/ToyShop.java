package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int toys = puzzles + dolls + bears + minions + trucks;
        double money = puzzles * 2.60 + dolls * 3.0 + bears * 4.10 + minions * 8.20 + trucks * 2.0;
        if (toys >= 50)
            money *= 0.75;
        money *= 0.9;
        if (money >= excursionPrice)
            System.out.printf("Yes! %.2f lv left.", money - excursionPrice);
        else
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - money);
    }
}
