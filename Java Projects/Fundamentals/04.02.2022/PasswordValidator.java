package Lab;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean sizeCheck = SizeChecker(password);
        boolean lettersAndDigits = LettAndDig(password);
        boolean moreThan2digits = digChecker(password);

        if (sizeCheck && lettersAndDigits && moreThan2digits)
            System.out.println("Password is valid");
        else {
            if (!sizeCheck)
                System.out.println("Password must be between 6 and 10 characters");
            if (!lettersAndDigits)
                System.out.println("Password must consist only of letters and digits");
            if (!moreThan2digits)
                System.out.println("Password must have at least 2 digits");
        }
    }

    static boolean SizeChecker(String input) {
        return input.length() >= 6 && input.length() <= 10;
    }

    static boolean LettAndDig(String input) {
        boolean isTrue = false;
        int counter = 0;
        char[] symbols = new char[input.length()];
        for (int i = 0; i < input.length(); i++)
            symbols[i] = input.charAt(i);
        for (char symbol : symbols) {
            if (symbol >= 48 && symbol <= 57)
                counter++;
            if (symbol >= 65 && symbol <= 90)
                counter++;
            if (symbol >= 97 && symbol <= 122)
                counter++;
        }
        if (counter == input.length())
            isTrue = true;
        return isTrue;
    }

    static boolean digChecker(String input) {
        boolean isTrue = false;
        int digCounter = 0;
        char[] symbols = new char[input.length()];
        for (int i = 0; i < input.length(); i++)
            symbols[i] = input.charAt(i);
        for (char symbol : symbols) {
            if (symbol >= 48 && symbol <= 57)
                digCounter++;
            if (digCounter >= 2) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }
}
