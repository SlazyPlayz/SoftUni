package Lab;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number = Integer.parseInt(scanner.nextLine());
        int num = number;
        int sum = 0;
        int fact = 1;

        while (num != 0) {
            for (int i = 1; i <= num % 10; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
            fact = 1;
        }

        if (sum == number)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
