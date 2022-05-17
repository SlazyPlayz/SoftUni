package Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var start = Integer.parseInt(scanner.nextLine());
        var end = Integer.parseInt(scanner.nextLine());
        var magicNumber = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        int combPosition = -1;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;
                if (i+j==magicNumber && combPosition == -1) {
                    num1 = i;
                    num2 = j;
                    combPosition = combinations;
                }
            }
        }
        if (combPosition == -1)
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        else
            System.out.printf("Combination N:%d (%d + %d = %d)", combPosition, num1, num2, magicNumber);
    }
}
