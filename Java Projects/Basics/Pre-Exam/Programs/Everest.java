package Problems;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayCounter = 1;
        int totalMeters = 5364;
        while (true) {
            String yesOrNo = scanner.nextLine();
            if (yesOrNo.equals("END"))
                break;
            var climbedMeters = Integer.parseInt(scanner.nextLine());
            totalMeters += climbedMeters;
            if (yesOrNo.equals("Yes"))
                dayCounter++;
            if (dayCounter > 5 && totalMeters < 8848) {
                totalMeters -= climbedMeters;
                break;
            }
            if (totalMeters >= 8848)
                break;
        }
        if (totalMeters >= 8848)
            System.out.printf("Goal reached for %d days!", dayCounter);
        else
            System.out.printf("Failed! \n%d", totalMeters);
    }
}
