package Exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var degrees = Integer.parseInt(scanner.nextLine());
        String daytime = scanner.nextLine();
        String Outfit = "";
        String Shoes = "";
        if (degrees >= 10 && degrees <= 18) {
            if (daytime.equals("Morning")) {
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";
            }
            if (daytime.equals("Afternoon")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
            if (daytime.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        if (degrees > 18 && degrees <= 24) {
            if (daytime.equals("Morning")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
            if (daytime.equals("Afternoon")) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            }
            if (daytime.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        if (degrees >= 25) {
            if (daytime.equals("Morning")) {
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            }
            if (daytime.equals("Afternoon")) {
                Outfit = "Swim Suit";
                Shoes = "Barefoot";
            }
            if (daytime.equals("Evening")) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, Outfit, Shoes);
    }
}
