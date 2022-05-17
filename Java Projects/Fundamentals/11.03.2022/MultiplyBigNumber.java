package com.company;

import java.util.*;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        var smallNumber = Integer.parseInt(scanner.nextLine());
        StringBuilder finalNumber = new StringBuilder();
        int remainder = 0;

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            int temp = digit * smallNumber + remainder;

            if (i == 0)
                finalNumber.insert(0, temp);
            else {
                int digitToAdd = temp % 10;
                remainder = temp / 10;
                finalNumber.insert(0, digitToAdd);
            }
        }
        while (finalNumber.charAt(0) == '0' && finalNumber.length() > 1)
            finalNumber.deleteCharAt(0);
        System.out.println(finalNumber);
    }
}
