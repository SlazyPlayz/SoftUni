package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> people = new ArrayList<>();
        var commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            String[] command = scanner.nextLine().split(" ");
            String person = command[0];
            if (command.length == 3) {
                if (!people.contains(person))
                    people.add(person);
                else
                    System.out.println(person + " is already in the list!");
            }
            else {
                if (people.contains(person))
                    people.remove(person);
                else
                    System.out.println(person + " is not in the list!");
            }
        }

        for (var person : people) {
            System.out.println(person);
        }
    }
}
