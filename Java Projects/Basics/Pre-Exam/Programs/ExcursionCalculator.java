package Problems;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double pricePerPerson = 0.00;
        double discountOrMarkup = 0.00;

        //calculations
        if (people <= 5) {
            switch (season) {
                case "spring":
                    pricePerPerson = 50.00;
                    break;
                case "summer":
                    pricePerPerson = 48.50;
                    discountOrMarkup = -0.15;
                    break;
                case "autumn":
                    pricePerPerson = 60.00;
                    break;
                case "winter":
                    pricePerPerson = 86.00;
                    discountOrMarkup = 0.08;
                    break;
            }
        } else {
            switch (season) {
                case "spring":
                    pricePerPerson = 48.00;
                    break;
                case "summer":
                    pricePerPerson = 45.00;
                    discountOrMarkup = -0.15;
                    break;
                case "autumn":
                    pricePerPerson = 49.50;
                    break;
                case "winter":
                    pricePerPerson = 85.00;
                    discountOrMarkup = 0.08;
                    break;
            }
        }

        //final price
        double finalPrice = pricePerPerson * people;
        finalPrice += finalPrice * discountOrMarkup;

        //output
        System.out.printf("%.2f leva.", finalPrice);
    }
}
