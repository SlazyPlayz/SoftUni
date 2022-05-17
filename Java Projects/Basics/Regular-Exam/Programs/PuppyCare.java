package Problems;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        var availableFood = Integer.parseInt(scanner.nextLine());

        //convert kg to gram
        availableFood *= 1000;

        //counter
        int totalEatenFood = 0;

        //food calculations
        while (true) {
            String foodEaten = scanner.nextLine();

            //output and end of cycle
            if (foodEaten.equals("Adopted")) {
                if (totalEatenFood > availableFood)
                    System.out.printf("Food is not enough. You need %d grams more.", totalEatenFood - availableFood);
                else
                    System.out.printf("Food is enough! Leftovers: %d grams.", availableFood - totalEatenFood);
                break;
            }

            var eatenFood = Integer.parseInt(foodEaten);
            totalEatenFood += eatenFood;
        }
    }
}
