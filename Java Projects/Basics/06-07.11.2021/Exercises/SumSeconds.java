package ConditionalStatements.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int min = (first + second + third) / 60;
        int sumSec = (first + second + third) % 60;
        if (sumSec < 10)
            System.out.printf("%d:0%d", min, sumSec);
        else
            System.out.printf("%d:%d", min, sumSec);
    }
}
