package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());

        Pattern patternBoss = Pattern.compile("\\|[A-Z]{4,}\\|");
        Pattern patternTitle = Pattern.compile("#[A-Za-z]+ [A-Za-z]+#");
        Pattern patternPerson = Pattern.compile("\\|[A-Z]{4,}\\|:#[A-Za-z]+ [A-Za-z]+#");

        for (int i = 0; i < n; i++) {
            String person = scanner.nextLine();
            Matcher matcherPerson = patternPerson.matcher(person);
            StringBuilder sbPerson = new StringBuilder();
            while (matcherPerson.find())
                sbPerson.append(matcherPerson.group());
            if (sbPerson.length() > 0) {
                String[] input = person.split(":");
                String name = input[0];
                String title = input[1];
                Matcher matcherBoss = patternBoss.matcher(name);
                Matcher matcherTitle = patternTitle.matcher(title);
                StringBuilder sbBoss = new StringBuilder();
                StringBuilder sbTitle = new StringBuilder();
                while (matcherBoss.find())
                    sbBoss.append(matcherBoss.group());
                while (matcherTitle.find())
                    sbTitle.append(matcherTitle.group());
                sbBoss.deleteCharAt(0);
                sbBoss.deleteCharAt(sbBoss.length() - 1);
                sbTitle.deleteCharAt(0);
                sbTitle.deleteCharAt(sbTitle.length() - 1);
                String nameTemp = sbBoss.toString();
                String titleTemp = sbTitle.toString();
                System.out.printf("%s, The %s", nameTemp, titleTemp);
                System.out.println();
                System.out.println(">> Strength: " + nameTemp.length());
                System.out.println(">> Armor: " + titleTemp.length());
            } else
                System.out.println("Access denied!");
        }
    }
}
