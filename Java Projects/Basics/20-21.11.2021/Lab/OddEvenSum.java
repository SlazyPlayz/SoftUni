package Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < n; i++) {
            var num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 1)
                sumOdd += num;
            else
                sumEven += num;
        }
        if (sumOdd == sumEven)
            System.out.printf("Yes\nSum = %d", sumEven);
        else
            System.out.printf("No\nDiff = %d", Math.abs(sumOdd-sumEven));
    }
}
