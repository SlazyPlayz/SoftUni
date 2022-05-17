package Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            var num = Integer.parseInt(scanner.nextLine());
            if (maxNum < num) {
                maxNum = num;
            }
            if (minNum > num) {
                minNum = num;
            }
        }
        System.out.printf("Max number: %d\n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
