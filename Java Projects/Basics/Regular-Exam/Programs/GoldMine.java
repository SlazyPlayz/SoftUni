package Problems;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //first input
        var locations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locations; i++) {

            //expected gold and mine days input
            var expectedDailyGold = Double.parseDouble(scanner.nextLine());
            var mineDays = Integer.parseInt(scanner.nextLine());
            double sum = 0;

            //daily gold input
            for (int j = 0; j < mineDays; j++) {
                var dailyGold = Double.parseDouble(scanner.nextLine());
                sum += dailyGold;
            }

            //convert sum from total to daily
            sum /= mineDays;

            //output
            if (sum >= expectedDailyGold)
                System.out.printf("Good job! Average gold per day: %.2f.\n", sum);
            else
                System.out.printf("You need %.2f gold.\n", expectedDailyGold - sum);
        }
    }
}
