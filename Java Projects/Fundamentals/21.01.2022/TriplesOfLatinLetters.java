package com.company;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char firstLetter = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                char secondLetter = (char) ('a' + j);
                for (int k = 0; k < n; k++) {
                    char thirdLetter = (char) ('a' + k);
                    System.out.printf("%c%c%c", firstLetter, secondLetter, thirdLetter);
                    System.out.println();
                }
            }
        }
    }
}
