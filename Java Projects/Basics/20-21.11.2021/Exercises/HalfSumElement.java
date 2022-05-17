package Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            var num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > maxNum)
                maxNum = num;
        }
        sum -= maxNum;
        if (sum == maxNum)
            System.out.printf("Yes\nSum = %d", sum);
        else
            System.out.printf("No\nDiff = %d", Math.abs(sum - maxNum));
    }
}
