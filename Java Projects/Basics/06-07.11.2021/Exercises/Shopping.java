package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int GPU = Integer.parseInt(scanner.nextLine());
        int CPU = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());
        double gpuPrice = GPU * 250;
        double cpuPrice = CPU * gpuPrice * 0.35;
        double ramPrice = RAM * gpuPrice / 10;
        double price = gpuPrice + cpuPrice + ramPrice;
        if (GPU > CPU)
            price *= 0.85;
        if (budget >= price)
            System.out.printf("You have %.2f leva left!", budget - price);
        else
            System.out.printf("Not enough money! You need %.2f leva more!", price - budget);
    }
}
