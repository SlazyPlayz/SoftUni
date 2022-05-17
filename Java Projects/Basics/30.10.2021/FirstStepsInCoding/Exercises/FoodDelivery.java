package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());
        double menuTotal = chicken * 10.35 + fish * 12.40 + vegetarian * 8.15;
        double price = 1.2 * menuTotal + 2.5;
        System.out.println(price);
    }
}
