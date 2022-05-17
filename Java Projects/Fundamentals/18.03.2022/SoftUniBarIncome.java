package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern namePattern = Pattern.compile("%[A-Z][a-z]+%");
        Pattern productPattern = Pattern.compile("<\\w+>");
        Pattern countPattern = Pattern.compile("\\|[0-9]+\\|");
        Pattern pricePattern = Pattern.compile("([0-9]+[\\.][0-9]+|[0-9]+)\\$");

        List<String> names = new ArrayList<>();
        List<String> products = new ArrayList<>();
        List<Double> prices = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of shift"))
                break;
            Matcher nameMatcher = namePattern.matcher(input);
            Matcher productMatcher = productPattern.matcher(input);
            Matcher countMatcher = countPattern.matcher(input);
            Matcher priceMatcher = pricePattern.matcher(input);
            StringBuilder name = new StringBuilder();
            StringBuilder product = new StringBuilder();
            StringBuilder count = new StringBuilder();
            StringBuilder price = new StringBuilder();
            while (nameMatcher.find())
                name.append(nameMatcher.group());
            while (productMatcher.find())
                product.append(productMatcher.group());
            while (countMatcher.find())
                count.append(countMatcher.group());
            while (priceMatcher.find())
                price.append(priceMatcher.group());
            if (name.length() > 0 && product.length() > 0 && count.length() > 0 && price.length() > 0) {
                name.deleteCharAt(0);
                name.deleteCharAt(name.length() - 1);
                product.deleteCharAt(0);
                product.deleteCharAt(product.length() - 1);
                count.deleteCharAt(0);
                count.deleteCharAt(count.length() - 1);
                price.deleteCharAt(price.length() - 1);
                names.add(String.valueOf(name));
                products.add(String.valueOf(product));
                double priceTemp = Double.parseDouble(String.valueOf(price));
                int countTemp = Integer.parseInt(String.valueOf(count));
                prices.add(priceTemp * countTemp);
            }
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s: %s - %.2f", names.get(i), products.get(i), prices.get(i));
            System.out.println();
        }
        double sum = 0;
        for (var el : prices)
            sum += el;
        System.out.printf("Total income: %.2f", sum);
    }
}
