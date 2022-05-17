package com.company;

import java.util.*;

public class ReplaceRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input);

        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1)) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);
    }
}
