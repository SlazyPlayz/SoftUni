package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern namePattern = Pattern.compile("[A-Za-z]+");
        Pattern distancePattern = Pattern.compile("[0-9]+");
        String[] participants = scanner.nextLine().split(", ");
        Map<String, Integer> racers = new HashMap<>();
        List<String> names = new ArrayList<>();
        List<Integer> distances = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of race"))
                break;
            Matcher nameMatcher = namePattern.matcher(input);
            Matcher distanceMatcher = distancePattern.matcher(input);
            StringBuilder name = new StringBuilder();
            StringBuilder distance = new StringBuilder();
            while (nameMatcher.find())
                name.append(nameMatcher.group());
            while (distanceMatcher.find())
                distance.append(distanceMatcher.group());
            int sum = 0;
            for (int i = 0; i < distance.length(); i++)
                sum += Integer.parseInt(String.valueOf(distance.charAt(i)));
            boolean participated = false;
            for (var el : participants) {
                if (el.equals(String.valueOf(name))) {
                    participated = true;
                    break;
                }
            }
            if (participated) {
                if (racers.containsKey(String.valueOf(name))) {
                    racers.put(String.valueOf(name), racers.get(String.valueOf(name)) + sum);
                } else {
                    racers.put(String.valueOf(name), sum);
                }
            }
        }

        while (!racers.isEmpty()) {
            names.add(GetMaxName(racers));
            distances.add(racers.get(GetMaxName(racers)));
            racers.remove(GetMaxName(racers));
        }
        System.out.printf("1st place: %s", names.get(0));
        System.out.println();
        System.out.printf("2nd place: %s", names.get(1));
        System.out.println();
        System.out.printf("3rd place: %s", names.get(2));
    }

    private static String GetMaxName(Map<String, Integer> racers) {
        int max = 0;
        String maxName = "";
        for (var el : racers.entrySet()) {
            if (el.getValue() > max) {
                maxName = el.getKey();
                max = el.getValue();
            }
        }
        return maxName;
    }
}
