package Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                String evenOrOdd;
                if (result % 2 == 0)
                    evenOrOdd = "even";
                else
                    evenOrOdd = "odd";
                System.out.printf("%d %c %d = %.0f - %s", num1, operator, num2, result, evenOrOdd);
                break;
            case '-':
                result = num1 - num2;
                if (result % 2 == 0)
                    evenOrOdd = "even";
                else
                    evenOrOdd = "odd";
                System.out.printf("%d %c %d = %.0f - %s", num1, operator, num2, result, evenOrOdd);
                break;
            case '*':
                result = num1 * num2;
                if (result % 2 == 0)
                    evenOrOdd = "even";
                else
                    evenOrOdd = "odd";
                System.out.printf("%d %c %d = %.0f - %s", num1, operator, num2, result, evenOrOdd);
                break;
            case '/':
                if (num2 == 0)
                    System.out.printf("Cannot divide %d by zero", num1);
                else {
                    result = 1.0*num1/num2;
                    System.out.printf("%d / %d = %.2f", num1, num2, result);
                }
                break;
            case '%':
                if (num2 == 0)
                    System.out.printf("Cannot divide %d by zero", num1);
                else {
                    result = num1%num2;
                    System.out.printf("%d %% %d = %f", num1, num2, result);
                }
                break;
        }
    }
}
