package Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var age = Integer.parseInt(scanner.nextLine());
        var washMachPrice = Double.parseDouble(scanner.nextLine());
        var toyPrice = Integer.parseInt(scanner.nextLine());
        double money = 0;
        int toys = 0;
        double toyMoney = 0;
        double totalMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += 5 * i;
                money -= 1;
            } else
                toys++;
        }
        toyMoney = toys * toyPrice;
        totalMoney = money + toyMoney;
        if (totalMoney >= washMachPrice)
            System.out.printf("Yes! %.2f", totalMoney - washMachPrice);
        else
            System.out.printf("No! %.2f", washMachPrice - totalMoney);
    }
}
