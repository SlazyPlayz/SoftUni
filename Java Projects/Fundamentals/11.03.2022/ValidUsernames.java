package com.company;

import java.util.*;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (var el : input) {
            if (el.length() > 3 && el.length() < 16) {
                char[] symbols = el.toLowerCase().toCharArray();
                boolean isGood = false;
                for (var symbol : symbols) {
                    if (((symbol >= 97 && symbol <= 122) || (symbol >= 48 && symbol <= 57) || symbol == 45 || symbol == 95))
                        isGood = true;
                    else {
                        isGood = false;
                        break;
                    }
                }
                if (isGood)
                    System.out.println(el);
            }
        }
    }
}