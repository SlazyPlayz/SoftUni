package Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        double minNum = Integer.MAX_VALUE;
        while (!number.equals("Stop")) {
            var num = Integer.parseInt(number);
            minNum = Math.min(num, minNum);
            number = scanner.nextLine();
        }
        System.out.printf("%.0f", minNum);
    }
}
