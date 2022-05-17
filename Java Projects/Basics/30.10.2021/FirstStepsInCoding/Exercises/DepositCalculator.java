package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        interest/=100;
        double bonusSum = (depSum * interest) / 12;
        double finalSum = depSum + months * bonusSum;
        System.out.println(finalSum);

    }
}
