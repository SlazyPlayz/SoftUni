package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> passengers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end"))
                break;
            else {
                String comd = command.split(" ")[0];
                int value = Integer.parseInt(command.split(" ")[1]);
                switch (comd) {
                    case "Delete":
                        for (int i = 0; i < passengers.size(); i++) {
                            if (passengers.get(i) == value) {
                                passengers.remove(i);
                                i--;
                            }
                        }
                        break;
                    case "Insert":
                        int index = Integer.parseInt(command.split(" ")[2]);
                        passengers.add(index, value);
                        break;
                }
            }
        }
        for (var el : passengers) {
            System.out.print(el + " ");
        }
    }
}
