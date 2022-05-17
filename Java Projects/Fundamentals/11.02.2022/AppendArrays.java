package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int size = list.size() - 1;
        if (size % 2 == 0) {
            for (int i = 0; i < size / 2; i++) {
                String selectedItem = list.get(i);
                list.set(i, list.get(size - i));
                list.set(size - i, selectedItem);
            }
        }
        else {
            for (int i = 0; i < (size + 1) / 2; i++) {
                String selectedItem = list.get(i);
                list.set(i, list.get(size - i));
                list.set(size - i, selectedItem);
            }
        }

        List<Integer> output = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            String item = list.get(i);
            String[] items = item.split("\\s+");
            for (String el : items) {
                if (!el.equals("")) {
                    int elInt = Integer.parseInt(el);
                    output.add(elInt);
                }
            }
        }

        for (Integer el : output)
            System.out.print(el + " ");
    }
}
