package Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        var nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;
        double saleStudio = 0;
        double saleApartment = 0;
        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }
        if (nights > 7 && nights <= 14) {
            if (month.equals("May") || month.equals("October"))
                saleStudio = 0.05;
        } else if (nights > 14) {
            switch (month) {
                case "May":
                case "October":
                    saleStudio = 0.3;
                    break;
                case "June":
                case "September":
                    saleStudio = 0.2;
                    break;
            }
            saleApartment = 0.1;
        }
        System.out.printf("Apartment: %.2f lv.\n", priceApartment * nights * (1 - saleApartment));
        System.out.printf("Studio: %.2f lv.", priceStudio * nights * (1 - saleStudio));
    }
}
