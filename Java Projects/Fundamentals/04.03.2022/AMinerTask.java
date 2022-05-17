package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap <String, Integer> resources = new LinkedHashMap <String, Integer>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop"))
                break;
            var quantity = Integer.parseInt(scanner.nextLine());
            if (resources.containsKey(input))
                resources.put(input, resources.get(input) + quantity);
            else
                resources.put(input, quantity);
        }

        for (Map.Entry<String, Integer> el : resources.entrySet()) {
            System.out.printf("%s -> %d", el.getKey(), el.getValue());
            System.out.println();
        }
    }
}
