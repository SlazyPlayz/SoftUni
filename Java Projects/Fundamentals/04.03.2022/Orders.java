package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> prices = new LinkedHashMap<>();
        Map<String, Double> quantities = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("buy"))
                break;
            String[] item = input.split(" ");
            String name = item[0];
            Double price = Double.parseDouble(item[1]);
            Double quantity = Double.parseDouble(item[2]);

            if (prices.containsKey(name)) {
                prices.put(name, price);
                quantities.put(name, quantities.get(name) + quantity);
            } else {
                prices.put(name, price);
                quantities.put(name, quantity);
            }
        }

        for (var item : prices.entrySet()) {
            var itemKey = item.getKey();
            Double price = item.getValue();
            Double quantity = quantities.get(itemKey);
            double finalPrice = price * quantity;
            System.out.printf("%s -> %.2f", item.getKey(), finalPrice);
            System.out.println();
        }
    }
}
