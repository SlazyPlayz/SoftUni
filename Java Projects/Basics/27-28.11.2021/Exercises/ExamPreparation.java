package Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var badProblems = Integer.parseInt(scanner.nextLine());
        String lastProblem = "";
        String problem;
        int grade;
        int sumgrade = 0;
        int badgradeCounter = 0;
        int problemCounter = 0;
        while (badgradeCounter < badProblems) {
            problem = scanner.nextLine();
            if (problem.equals("Enough"))
                break;
            grade = Integer.parseInt(scanner.nextLine());
            sumgrade += grade;
            lastProblem = problem;
            if (grade <= 4)
                badgradeCounter++;
            problemCounter++;
        }
        if (badgradeCounter >= badProblems)
            System.out.printf("You need a break, %d poor grades.", badgradeCounter);
        else {
            System.out.printf("Average score: %.2f\n", sumgrade * 1.0 / problemCounter);
            System.out.printf("Number of problems: %d\n", problemCounter);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
