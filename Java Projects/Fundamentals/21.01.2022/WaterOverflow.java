package com.company;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        var waterAmount = 0;

        for (int i = 0; i < n; i++) {
            var waterAdded = Integer.parseInt(scanner.nextLine());
            if (waterAmount + waterAdded > 255)
                System.out.println("Insufficient capacity!");
            else
                waterAmount += waterAdded;
        }
        System.out.println(waterAmount);
    }
}
