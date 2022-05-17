package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int movieTime = Integer.parseInt(scanner.nextLine());
        int allRestTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = allRestTime / 8.0;
        double restTime = allRestTime / 4.0;

        double leftTime = allRestTime - lunchTime - restTime;

        double diff = Math.abs(leftTime - movieTime);
        if (leftTime >= movieTime)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, Math.ceil(diff));
        else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, Math.ceil(diff));
    }
}
