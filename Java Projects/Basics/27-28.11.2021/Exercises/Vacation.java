package Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var neededMoney = Double.parseDouble(scanner.nextLine());
        var availableMoney = Double.parseDouble(scanner.nextLine());
        int dayCounter = 0;
        int spendingDays = 0;
        while (availableMoney < neededMoney) {
            String saveOrSpend = scanner.nextLine();
            var currentMoney = Double.parseDouble(scanner.nextLine());
            if (saveOrSpend.equals("save")) {
                availableMoney += currentMoney;
                spendingDays = 0;
            }
            if (saveOrSpend.equals("spend")) {
                availableMoney -= currentMoney;
                spendingDays++;
            }
            if (availableMoney < 0)
                availableMoney = 0;
            dayCounter++;
            if (spendingDays >= 5)
                break;
        }
        if (spendingDays >= 5) {
            System.out.println("You can't save the money.");
            System.out.println(dayCounter);
        } else
            System.out.printf("You saved the money for %d days.", dayCounter);
    }
}
