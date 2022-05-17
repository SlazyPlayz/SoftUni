package Lab;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = Integer.parseInt(scanner.nextLine());
        var b = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", factorial(a) / factorial(b));
    }

     static double factorial(int num) {
        double result = num;
        for (int i = num - 1; i > 0; i--)
            result *= i;
        return result;
    }
}
