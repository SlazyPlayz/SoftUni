package Problems;

import java.util.Scanner;

public class AndProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        var neededProcessors = Integer.parseInt(scanner.nextLine());
        var workers = Integer.parseInt(scanner.nextLine());
        var workDays = Integer.parseInt(scanner.nextLine());

        //processor amount calculations
        int totalWorkHours = workers * workDays * 8;
        double processorsMade = Math.floor(totalWorkHours / 3.0);

        //output
        if (processorsMade >= neededProcessors)
            System.out.printf("Profit: -> %.2f BGN", (processorsMade - neededProcessors) * 110.10);
        else
            System.out.printf("Losses: -> %.2f BGN", (neededProcessors - processorsMade) * 110.10);
    }
}
