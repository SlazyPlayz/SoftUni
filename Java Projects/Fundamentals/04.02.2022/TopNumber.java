package Lab;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean isValid = CheckNum(i);
            if (isValid)
                System.out.println(i);
        }
    }

    static boolean CheckNum(int num) {
        int sumOfDigits = 0;
        boolean hasOdd = false;
        while (num > 0) {
            int lastDigit = num % 10;
            sumOfDigits += lastDigit;
            if (lastDigit % 2 == 1)
                hasOdd = true;
            num /= 10;
        }
        if (sumOfDigits % 8 == 0 && hasOdd)
            return true;
        else
            return false;
    }
}
