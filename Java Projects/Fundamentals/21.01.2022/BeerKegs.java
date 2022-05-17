package com.company;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double maxVolume = 0;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            var radius = Double.parseDouble(scanner.nextLine());
            var height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
