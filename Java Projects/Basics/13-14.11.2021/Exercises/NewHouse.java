package Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        var flowerNumber = Integer.parseInt(scanner.nextLine());
        var budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (flowerType) {
            case "Roses":
                price = 5 * flowerNumber;
                if (flowerNumber > 80)
                    price *= 0.9;
                break;
            case "Dahlias":
                price = 3.8 * flowerNumber;
                if (flowerNumber > 90)
                    price *= 0.85;
                break;
            case "Tulips":
                price = 2.8 * flowerNumber;
                if (flowerNumber > 80)
                    price *= 0.85;
                break;
            case "Narcissus":
                price = 3 * flowerNumber;
                if (flowerNumber < 120)
                    price *= 1.12;
                break;
            case "Gladiolus":
                price = 2.5 * flowerNumber;
                if (flowerNumber < 80)
                    price *= 1.2;
                break;
        }
        if (budget >= price)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerNumber, flowerType, budget - price);
        else
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
    }
}
