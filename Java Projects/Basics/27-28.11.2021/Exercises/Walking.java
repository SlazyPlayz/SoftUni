package Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String steps = scanner.nextLine();
            if (steps.equals("Going home")) {
                steps = scanner.nextLine();
                int currentSteps = Integer.parseInt(steps);
                sum += currentSteps;
                if (sum < 10000)
                    break;

            }
            else {
                int currentSteps = Integer.parseInt(steps);
                sum += currentSteps;
            }
            if (sum >= 10000)
                break;
        }
        if (sum < 10000)
            System.out.printf("%d more steps to reach goal.", 10000-sum);
        else
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", sum-10000);
    }
}
