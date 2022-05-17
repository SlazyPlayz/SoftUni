package com.company;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        var p = Integer.parseInt(scanner.nextLine());

        if (n % p == 0)
            System.out.println(n / p);
        else
            System.out.println(n / p + 1);
    }
}
