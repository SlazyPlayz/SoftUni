package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var items = new LinkedHashMap <String, Integer>();
        boolean isShadowmourne = false;
        boolean isValanyr = false;
        boolean isDragonwrath = false;

        while (!isShadowmourne && !isValanyr && !isDragonwrath) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length - 1; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                var material = input[i + 1].toLowerCase();

                if (items.containsKey(material))
                    items.put(material, items.get(material) + quantity);
                else
                    items.put(material, quantity);

                if (items.containsKey("shards") && items.get("shards") >= 250) {
                    isShadowmourne = true;
                    items.put("shards", items.get("shards") - 250);
                    break;
                }
                if (items.containsKey("fragments") && items.get("fragments") >= 250) {
                    isValanyr = true;
                    items.put("fragments", items.get("fragments") - 250);
                    break;
                }
                if (items.containsKey("motes") && items.get("motes") >= 250) {
                    isDragonwrath = true;
                    items.put("motes", items.get("motes") - 250);
                    break;
                }
            }
        }

        if (!items.containsKey("shards"))
            items.put("shards", 0);
        if (!items.containsKey("fragments"))
            items.put("fragments", 0);
        if (!items.containsKey("motes"))
            items.put("motes", 0);

        if (isShadowmourne)
            System.out.println("Shadowmourne obtained!");
        else if (isValanyr)
            System.out.println("Valanyr obtained!");
        else System.out.println("Dragonwrath obtained!");


        System.out.println("shards: " + items.get("shards"));
        items.remove("shards", items.get("shards"));
        System.out.println("fragments: " + items.get("fragments"));
        items.remove("fragments", items.get("fragments"));
        System.out.println("motes: " + items.get("motes"));
        items.remove("motes", items.get("motes"));

        for (var el : items.entrySet()) {
            System.out.printf("%s: %d", el.getKey(), el.getValue());
            System.out.println();
        }
    }
}
