package Lab;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.toLowerCase();

        VowelCounter(input);
    }

    static void VowelCounter(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117 || letter == 121)
                counter++;
        }
        System.out.println(counter);
    }
}
