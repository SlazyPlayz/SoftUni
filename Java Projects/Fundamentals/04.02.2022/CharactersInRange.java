package Lab;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char repl = a;

        if (b < a) {
            a = b;
            b = repl;
        }

        Characters(a, b);
    }
    static void Characters (char a, char b) {
        for (int i = a + 1; i < b; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}
