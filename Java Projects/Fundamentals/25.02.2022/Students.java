package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        Student student = new Student();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            student.setFirstNames(input[0]);
            student.setLastNames(input[1]);
            student.setGrades(Double.parseDouble(input[2]));
        }
        student.Sort();

        List<String> firstNames = student.getSortedFirstNames();
        List<String> lastNames = student.getSortedLastNames();
        List<Double> grades = student.getSortedGrades();

        for (int i = 0; i < firstNames.size(); i++) {
            String firstName = firstNames.get(i);
            String lastName = lastNames.get(i);
            double grade = grades.get(i);
            System.out.printf("%s %s: %.2f", firstName, lastName, grade);
            System.out.println();
        }
    }
}

class Student {
    private List<String> firstNames = new ArrayList<>();
    private List<String> lastNames = new ArrayList<>();
    private List<Double> grades = new ArrayList<>();
    private List<String> sortedFirstNames = new ArrayList<>();
    private List<String> sortedLastNames = new ArrayList<>();
    private List<Double> sortedGrades = new ArrayList<>();

    public void setFirstNames(String firstNames) {
        this.firstNames.add(firstNames);
    }

    public void setLastNames(String lastNames) {
        this.lastNames.add(lastNames);
    }

    public void setGrades(double grades) {
        this.grades.add(grades);
    }

    public void Sort() {
        while (lastNames.size() > 0) {
            double maxGrade = grades.get(0);
            for (var el : grades) {
                if (el > maxGrade)
                    maxGrade = el;
            }
            int index = grades.indexOf(maxGrade);
            sortedGrades.add(maxGrade);
            sortedFirstNames.add(firstNames.get(index));
            sortedLastNames.add(lastNames.get(index));
            grades.remove(maxGrade);
            firstNames.remove(index);
            lastNames.remove(index);
        }
    }

    public List<String> getSortedFirstNames() {
        return sortedFirstNames;
    }

    public List<String> getSortedLastNames() {
        return sortedLastNames;
    }

    public List<Double> getSortedGrades() {
        return sortedGrades;
    }
}
