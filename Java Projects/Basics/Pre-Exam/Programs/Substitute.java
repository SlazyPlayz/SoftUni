package Problems;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var k = Integer.parseInt(scanner.nextLine());
        var l = Integer.parseInt(scanner.nextLine());
        var m = Integer.parseInt(scanner.nextLine());
        var n = Integer.parseInt(scanner.nextLine());

        if (l % 2 == 0)
            l++;
        if (n % 2 == 0)
            n++;

        int subCounter = 0;
        while (subCounter < 6) {
            for (int firstNumber1 = k; firstNumber1 <= 8; firstNumber1++) {
                for (int firstNumber2 = 9; firstNumber2 >= l; firstNumber2--) {
                    for (int secondNumber1 = m; secondNumber1 <= 8; secondNumber1++) {
                        for (int secondNumber2 = 9; secondNumber2 >= n; secondNumber2--) {
                            if (firstNumber1 % 2 == 0 && secondNumber1 % 2 == 0 && firstNumber2 % 2 != 0 && secondNumber2 % 2 != 0) {
                                if (firstNumber1 == secondNumber1 && firstNumber2 == secondNumber2)
                                    System.out.println("Cannot change the same player.");
                                else {
                                    if (firstNumber1 == 8 && firstNumber2 == l && secondNumber1 == 8 && secondNumber2 == n) {
                                        System.out.println("" + firstNumber1 + firstNumber2 + " - " + secondNumber1 + secondNumber2);
                                        subCounter = 6;
                                    } else {
                                        System.out.println("" + firstNumber1 + firstNumber2 + " - " + secondNumber1 + secondNumber2);
                                        subCounter++;
                                        if (subCounter == 6) {
                                            firstNumber1 = 9;
                                            firstNumber2 = l - 1;
                                            secondNumber1 = 9;
                                            secondNumber2 = n - 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
