package com.company;

import java.util.*;

public class WizardSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder spell = new StringBuilder(scanner.nextLine());

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("Abracadabra"))
                break;

            String command = input[0];
            switch (command) {
                case "Abjuration":
                    Abjuration(spell);
                    break;
                case "Necromancy":
                    Necromancy(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(input[1]);
                    char letter = input[2].charAt(0);
                    Illusion(spell, index, letter);
                    break;
                case "Divination":
                    String first = input[1];
                    String second = input[2];
                    Divination(spell, first, second);
                    break;
                case "Alteration":
                    String subStr = input[1];
                    Alteration(spell, subStr);
                    break;
                default:
                    System.out.println("The spell did not work!");
            }
        }
    }

    private static void Abjuration(StringBuilder spell) {
        spell.replace(0, spell.length(), spell.toString().toUpperCase());
        System.out.println(spell);
    }

    private static void Necromancy(StringBuilder spell) {
        spell.replace(0, spell.length(), spell.toString().toLowerCase());
        System.out.println(spell);
    }

    private static void Illusion(StringBuilder spell, int index, char letter) {
        if (index < spell.length()) {
            spell.replace(index, index + 1, String.valueOf(letter));
            System.out.println("Done!");
        } else
            System.out.println("The spell was too weak.");
    }

    private static void Divination (StringBuilder spell, String first, String second) {
        boolean isTrue = false;
        for (int i = 0; i <= spell.length() - first.length(); i++) {
            String subStr = spell.substring(i, i + first.length());
            if (subStr.equals(first)) {
                spell.replace(i, i + first.length(), second);
                isTrue = true;
            }
        }
        if (isTrue)
            System.out.println(spell);
    }

    private static void Alteration (StringBuilder spell, String subString) {
        boolean isTrue = false;
        for (int i = 0; i < spell.length(); i++) {
            String subStr = spell.substring(i, i + subString.length());
            if (subStr.equals(subString)) {
                spell.replace(i, i + subString.length(), "");
                isTrue = true;
            }
        }
        if (isTrue)
            System.out.println(spell);
    }
}
