package com.company;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> students = new LinkedHashMap<>();
        Map<String, Integer> counters = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end"))
                break;
            String[] array = input.split(" : ");
            String course = array[0];
            String student = array[1];
            if (students.containsKey(course)) {
                students.put(course, students.get(course) + ", " + student);
                counters.put(course, counters.get(course) + 1);
            }
            else {
                students.put(course, student);
                counters.put(course, 1);
            }
        }

        for (var student : students.entrySet()) {
            String course = student.getKey();
            String[] people = student.getValue().split(", ");
            Integer counter = counters.get(course);
            System.out.println(course + ": " + counter);
            for (var person : people) {
                System.out.println("-- " + person);
            }
        }
    }
}
