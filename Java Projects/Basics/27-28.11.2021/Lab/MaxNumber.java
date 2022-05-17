package Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        double maxNum = Integer.MIN_VALUE;
        while (!number.equals("Stop")) {
            var num = Integer.parseInt(number);
            maxNum = Math.max(num, maxNum);
            number = scanner.nextLine();
        }
        System.out.printf("%.0f", maxNum);
    }
}
