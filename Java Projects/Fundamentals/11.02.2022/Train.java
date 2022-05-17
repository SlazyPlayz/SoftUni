package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> passengers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        var maxCapacity = Integer.parseInt(scanner.nextLine());

        while (true) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("end"))
                break;
            if (command[0].equals("Add")) {
                passengers.add(Integer.parseInt(command[1]));
            } else {
                int passengersAdded = Integer.parseInt(command[0]);
                for (int i = 0; i < passengers.size(); i++) {
                    if (passengers.get(i) + passengersAdded <= maxCapacity) {
                        passengers.set(i, passengers.get(i) + passengersAdded);
                        break;
                    }
                }
            }
        }
        for (var item : passengers)
            System.out.print(item + " ");
    }
}
