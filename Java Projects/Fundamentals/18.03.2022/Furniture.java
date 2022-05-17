package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[>]{2}[\\w+]+[<]{2}([\\d.]+)![\\d]+");
        List<String> items = new ArrayList<>();
        List<Double> prices = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Purchase"))
                break;
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                sb.append(matcher.group());
                int indexOfLeftArrow = sb.lastIndexOf("<");
                int indexOfExclamationPoint = sb.lastIndexOf("!");
                items.add(sb.substring(2, indexOfLeftArrow - 1));
                double price = Double.parseDouble(sb.substring(indexOfLeftArrow + 1, indexOfExclamationPoint));
                int amount = Integer.parseInt(sb.substring(indexOfExclamationPoint + 1));
                prices.add(price * amount);
            }
        }

        double sum = 0;
        for (var el : prices)
            sum += el;
        System.out.println("Bought furniture:");
        for (var el : items)
            System.out.println(el);
        System.out.printf("Total money spend: %.2f", sum);
    }
}

