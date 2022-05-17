package Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var orders = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule;
        int days;
        int capsulesCount;
        double itemTotal;
        double total = 0;

        while (orders > 0) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());

            itemTotal = days * capsulesCount * pricePerCapsule;
            total += itemTotal;

            System.out.printf("The price for the coffee is: $%.2f\n", itemTotal);

            orders--;
        }
        System.out.printf("Total: $%.2f\n", total);
    }
}
