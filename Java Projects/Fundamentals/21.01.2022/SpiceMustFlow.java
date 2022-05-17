package Exercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int currentYield = startingYield;
        int spices = startingYield - 26;

        while (true) {
            currentYield -= 10;
            days++;
            if (currentYield < 100)
                break;
            spices += currentYield - 26;
        }

        if (days != 1)
            spices -= 26;

        System.out.println(days);
        System.out.println(spices);
    }
}