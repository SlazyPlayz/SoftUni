package Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = Integer.parseInt(scanner.nextLine());
        var m = Integer.parseInt(scanner.nextLine());
        for (int num = n; num <= m; num++) {
            int currentNumber = num;
            int sumodd = 0;
            int sumeven = 0;
            for (int i = 6; i > 0; i--) {
                if (i % 2 == 0)
                    sumeven += currentNumber % 10;
                else
                    sumodd += currentNumber % 10;
                currentNumber /= 10;
            }
            if (sumodd == sumeven)
                System.out.printf("%d ", num);
        }
    }
}
