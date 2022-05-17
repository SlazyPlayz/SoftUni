package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        nylon += 2.0;
        double matCosts = nylon * 1.5 + paint * 1.1 * 14.5 + thinner * 5.0 + 0.4;
        double hourlyPay = 0.3 * matCosts;
        double sum = matCosts + hourlyPay * hours;
        System.out.println(sum);
    }
}
