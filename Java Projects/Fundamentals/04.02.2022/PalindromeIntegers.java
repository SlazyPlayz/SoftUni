package Lab;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END"))
                break;

            if (input.length() == 1)
                System.out.println("true");
            else {
                String leftSide = leftSide(input);
                String rightSide = rightSide(input);
                if (leftSide.equals(rightSide))
                    System.out.println("true");
                else
                    System.out.println("false");
            }
        }
    }

    static String leftSide (String input) {
        String leftSide = "";
        for (int i = 0; i < input.length() / 2; i++)
            leftSide += input.charAt(i);
        return leftSide;
    }
    static String rightSide (String input) {
        String rightSide = "";
        if (input.length() % 2 == 0) {
            for (int i = input.length() - 1; i >= input.length() / 2; i--)
                rightSide += input.charAt(i);
        }
        if (input.length() % 2 == 1)
            for (int i = input.length() - 1; i > input.length() / 2; i--)
                rightSide += input.charAt(i);
        return rightSide;
    }
}
