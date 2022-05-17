package Problems;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var currentMoney = Double.parseDouble(scanner.nextLine());
        var dailyProfit = Double.parseDouble(scanner.nextLine());
        var costs = Double.parseDouble(scanner.nextLine());
        var giftPrice = Double.parseDouble(scanner.nextLine());

        //money calculations
        var finalMoney = currentMoney * 5 + dailyProfit * 5 - costs;

        //output
        if (finalMoney >= giftPrice)
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", finalMoney);
        else
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - finalMoney);
    }
}
