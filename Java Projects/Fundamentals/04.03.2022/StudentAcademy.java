package com.company;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> grades = new LinkedHashMap<>();
        Map<String, Integer> counters = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());
            if (grades.containsKey(student)) {
                grades.put(student, grades.get(student) + grade);
                counters.put(student, counters.get(student) + 1);
            }
            else {
                grades.put(student, grade);
                counters.put(student, 1);
            }
        }

        for (var student : grades.entrySet()) {
            String name = student.getKey();
            Double allGrades = student.getValue();
            Integer gradesCounter = counters.get(name);
            double averageGrade = allGrades / gradesCounter;
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f", name, averageGrade);
                System.out.println();
            }
        }
    }
}
