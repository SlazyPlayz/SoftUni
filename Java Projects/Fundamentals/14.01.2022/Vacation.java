package Lab;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        if (people >= 30)
                            price *= 0.85;
                        break;
                    case "Saturday":
                        price = 9.80;
                        if (people >= 30)
                            price *= 0.85;
                        break;
                    case "Sunday":
                        price = 10.46;
                        if (people >= 30)
                            price *= 0.85;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        if (people >= 100)
                            people -= 10;
                        break;
                    case "Saturday":
                        price = 15.60;
                        if (people >= 100)
                            people -= 10;
                        break;
                    case "Sunday":
                        price = 16.00;
                        if (people >= 100)
                            people -= 10;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15.00;
                        if (people >= 10 && people <= 20)
                            price *= 0.95;
                        break;
                    case "Saturday":
                        price = 20.00;
                        if (people >= 10 && people <= 20)
                            price *= 0.95;
                        break;
                    case "Sunday":
                        price = 22.50;
                        if (people >= 10 && people <= 20)
                            price *= 0.95;
                        break;
                }
                break;
        }

        price *= people;

        System.out.printf("Total price: %.2f", price);
    }
}
