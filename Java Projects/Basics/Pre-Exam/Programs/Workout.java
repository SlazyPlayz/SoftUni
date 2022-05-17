package Problems;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var days = Integer.parseInt(scanner.nextLine());
        var kilometers = Double.parseDouble(scanner.nextLine());
        double totalKilometers = kilometers;

        //input for daily percentages
        for (int i = 0; i < days; i++) {
            var percentage = Integer.parseInt(scanner.nextLine());
            kilometers += kilometers * (percentage * 1.0 / 100);
            totalKilometers += kilometers;
        }

        //output
        if (totalKilometers >= 1000)
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKilometers - 1000));
        else
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - totalKilometers));
    }
}
