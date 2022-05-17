package Lab;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 0;
        String input = scanner.nextLine();

        while (!input.equals("Start")) {
            var coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2)
                money += coin;
            else
                System.out.printf("Cannot accept %.2f\n", coin);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (money >= 2.0) {
                        System.out.println("Purchased " + input);
                        money -= 2.0;
                    } else
                        System.out.println("Sorry, not enough money");
                    break;
                case "Water":
                    if (money >= 0.7) {
                        System.out.println("Purchased " + input);
                        money -= 0.7;
                    } else
                        System.out.println("Sorry, not enough money");
                    break;
                case "Crisps":
                    if (money >= 1.5) {
                        System.out.println("Purchased " + input);
                        money -= 1.5;
                    } else
                        System.out.println("Sorry, not enough money");
                    break;
                case "Soda":
                    if (money >= 0.8) {
                        System.out.println("Purchased " + input);
                        money -= 0.8;
                    } else
                        System.out.println("Sorry, not enough money");
                    break;
                case "Coke":
                    if (money >= 1.0) {
                        System.out.println("Purchased " + input);
                        money -= 1.0;
                    } else
                        System.out.println("Sorry, not enough money");
                    break;
                default:
                    System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", money);
    }
}