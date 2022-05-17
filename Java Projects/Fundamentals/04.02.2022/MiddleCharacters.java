package Lab;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        MidChars(input);
    }

    static void MidChars(String input) {
        int midPos = input.length() / 2;
        char[] symbols = new char[input.length()];
        for (int i = 0; i < symbols.length; i++)
            symbols[i] = input.charAt(i);
        if (input.length() % 2 != 0)
            System.out.println(symbols[midPos]);
        else
            System.out.println(symbols[midPos - 1] + "" + symbols[midPos]);
    }
}
