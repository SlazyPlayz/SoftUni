package com.company;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var start = Integer.parseInt(scanner.nextLine());
        var end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
