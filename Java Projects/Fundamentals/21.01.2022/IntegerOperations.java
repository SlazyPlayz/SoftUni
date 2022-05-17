package com.company;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = Integer.parseInt(scanner.nextLine());
        var b = Integer.parseInt(scanner.nextLine());
        var c = Integer.parseInt(scanner.nextLine());
        var d = Integer.parseInt(scanner.nextLine());
        int result = a + b;
        result /= c;
        result *= d;
        System.out.println(result);
    }
}
