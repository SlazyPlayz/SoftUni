package Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = Integer.parseInt(scanner.nextLine());
        double finalSum = 0;
        int loopCounter = 0;
        String name = scanner.nextLine();
        while (!name.equals("Finish")) {
            double gradeSum = 0;
            for (int i = 0; i < n; i++) {
                var grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
                finalSum += grade;
            }
            System.out.printf("%s - %.2f.\n", name, gradeSum / n);
            loopCounter++;
            name = scanner.nextLine();
        }
        loopCounter *= n;
        System.out.printf("Student's final assessment is %.2f.", finalSum / loopCounter);
    }
}
