package Exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
        boolean isPrime = true;
        while (!num.equals("stop")) {
            int number = Integer.parseInt(num);
            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (number >= 0) {
                if (isPrime)
                    sumPrime += number;
                else
                    sumNonPrime += number;
                isPrime = true;
            }
            num = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}
