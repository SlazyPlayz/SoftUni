package Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String rating = scanner.nextLine();
        int price = 1;
        double discount = 0;
        double finalPrice = 1;
        if (accommodation.equals("room for one person"))
            price = 18;
        if (accommodation.equals("apartment")) {
            price = 25;
            if (days > 0 && days < 10)
                discount = 0.30;
            else if (days <= 15)
                discount = 0.35;
            else
                discount = 0.50;
        }
        if (accommodation.equals("president apartment")) {
            price = 35;
            if (days > 0 && days < 10)
                discount = 0.10;
            else if (days <= 15)
                discount = 0.15;
            else
                discount = 0.20;
        }
        if (rating.equals("positive")) {
            finalPrice = price * (1 - discount);
            finalPrice *= 1.25;
        } else if (rating.equals("negative")) {
            discount = (1-discount)*0.9;
            finalPrice = price * discount;
        }
        System.out.printf("%.2f", finalPrice * (days - 1));
    }
}
