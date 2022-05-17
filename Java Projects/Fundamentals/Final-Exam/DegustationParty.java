package com.company;

import java.util.*;

public class DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> people = new LinkedHashMap<>();
        int disLikedMeals = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop"))
                break;

            String[] command = input.split("-");
            String opinion = command[0];
            String guest = command[1];
            String meal = command[2];
            List<String> meals = new ArrayList<>();
            if (opinion.equals("Like")) {
                if (people.containsKey(guest)) {
                    meals = people.get(guest);
                    if (!people.get(guest).contains(meal)) {
                        meals.add(meal);
                    }
                }
                else {
                    meals.add(meal);
                }
                people.put(guest, meals);
            } else {
                if (people.containsKey(guest)) {
                    if (people.get(guest).contains(meal)) {
                        meals = people.get(guest);
                        meals.remove(meal);
                        people.put(guest, meals);
                        disLikedMeals++;
                        System.out.println(guest + " doesn't like the " + meal + ".");
                    } else
                        System.out.println(guest + " doesn't have the " + meal + " in his/her collection.");
                } else
                    System.out.println(guest + " is not at the party.");
            }
        }

        for (var person : people.entrySet()) {
            List<String> list = person.getValue();
            System.out.print(person.getKey() + ": ");
            System.out.print(String.join(", ", list));
            System.out.println();
        }
        System.out.println("Unliked meals: " + disLikedMeals);
    }
}

