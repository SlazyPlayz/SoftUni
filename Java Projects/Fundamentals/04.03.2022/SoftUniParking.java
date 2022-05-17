package com.company;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        Map<String, String> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String username = input[1];
            if (command.equals("register")) {
                if (cars.containsKey(username))
                    System.out.println("ERROR: already registered with plate number " + cars.get(username));
                else {
                    cars.put(username, input[2]);
                    System.out.println(username + " registered " + cars.get(username) + " successfully");
                }
            }
            if (command.equals("unregister")) {
                if (cars.containsKey(username)) {
                    System.out.println(username + " unregistered successfully");
                    cars.remove(username);
                }
                else
                    System.out.println("ERROR: user " + username + " not found");
            }
        }

        for (var car : cars.entrySet()) {
            System.out.println(car.getKey() + " => " + car.getValue());
        }
    }
}
