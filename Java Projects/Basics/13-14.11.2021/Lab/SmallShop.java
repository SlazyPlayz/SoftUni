package Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //          coffee	water	beer	sweets	peanuts
        //Sofia	    0.50	0.80	1.20	1.45	1.60
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        var amount = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        if (city.equals("Sofia")) {
            if (product.equals("coffee"))
                price = 0.50 * amount;
            else if (product.equals("water"))
                price = 0.80 * amount;
            else if (product.equals("beer"))
                price = 1.20 * amount;
            else if (product.equals("sweets"))
                price = 1.45 * amount;
            else if (product.equals("peanuts"))
                price = 1.60 * amount;
        }
        //          coffee	water	beer	sweets	peanuts
        //Plovdiv	0.40	0.70	1.15	1.30	1.50
        else if (city.equals("Plovdiv")) {
            if (product.equals("coffee"))
                price = 0.40 * amount;
            else if (product.equals("water"))
                price = 0.70 * amount;
            else if (product.equals("beer"))
                price = 1.15 * amount;
            else if (product.equals("sweets"))
                price = 1.30 * amount;
            else if (product.equals("peanuts"))
                price = 1.50 * amount;
        }
        //          coffee	water	beer	sweets	peanuts
        //Varna	    0.45	0.70	1.10	1.35	1.55
        else if (city.equals("Varna")) {
            if (product.equals("coffee"))
                price = 0.45 * amount;
            else if (product.equals("water"))
                price = 0.70 * amount;
            else if (product.equals("beer"))
                price = 1.10 * amount;
            else if (product.equals("sweets"))
                price = 1.35 * amount;
            else if (product.equals("peanuts"))
                price = 1.55 * amount;
        }
        System.out.println(price);
    }
}
