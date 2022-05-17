package Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var groups = Integer.parseInt(scanner.nextLine());
        int climbersMusala = 0;
        int climbersMontBlanc = 0;
        int climbersKilimanjaro = 0;
        int climbersK2 = 0;
        int climbersEverest = 0;
        int climbersTotal = 0;
        for (int i = 0; i < groups; i++) {
            var climbers = Integer.parseInt(scanner.nextLine());
            climbersTotal += climbers;
            if (climbers <= 5)
                climbersMusala += climbers;
            else if (climbers <= 12)
                climbersMontBlanc += climbers;
            else if (climbers <= 25)
                climbersKilimanjaro += climbers;
            else if (climbers <= 40)
                climbersK2 += climbers;
            else
                climbersEverest += climbers;
        }
        System.out.printf("%.2f%%\n", climbersMusala * 100.0 / climbersTotal);
        System.out.printf("%.2f%%\n", climbersMontBlanc * 100.0 / climbersTotal);
        System.out.printf("%.2f%%\n", climbersKilimanjaro * 100.0 / climbersTotal);
        System.out.printf("%.2f%%\n", climbersK2 * 100.0 / climbersTotal);
        System.out.printf("%.2f%%", climbersEverest * 100.0 / climbersTotal);
    }
}
