package ConditionalStatements.Exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if (points <= 100)
            bonusPoints = 5;
        else if (points > 100 && points <= 1000)
            bonusPoints = points / 5.0;
        else
            bonusPoints = points / 10.0;
        if (points % 2 == 0)
            bonusPoints += 1;
        if (points % 5 == 0 && points % 2 != 0)
            bonusPoints += 2;
        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);
    }
}
