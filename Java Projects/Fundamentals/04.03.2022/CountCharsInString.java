package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        var map = new LinkedHashMap<Character, Integer>();

        for (var el : input) {
            if (el != ' ') {
                if (map.containsKey(el))
                    map.put(el, map.get(el) + 1);
                else
                    map.put(el, 1);
            }
        }

        for (Map.Entry<Character, Integer> el : map.entrySet()) {
            System.out.printf("%c -> %d", el.getKey(), el.getValue());
            System.out.println();
        }
    }
}
