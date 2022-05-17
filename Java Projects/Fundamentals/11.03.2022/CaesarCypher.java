package com.company;

import java.util.*;

public class CaesarCypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] symbols = input.toCharArray();
        StringBuilder output = new StringBuilder();

        for (char symbol : symbols) {
            char symbolTemp = String.format("%c", symbol + 3).charAt(0);
            output.append(symbolTemp);
        }

        System.out.println(output);
    }
}
