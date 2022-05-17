package Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        var grade = Double.parseDouble(scanner.nextLine());
        int year = 1;
        double sumGrade = 0;
        int exclusions = 0;
        while (year <= 12) {
            if (grade < 4.00)
                exclusions++;
            if (exclusions > 1)
                break;
            sumGrade += grade;
            if (year == 12)
                break;
            grade = Double.parseDouble(scanner.nextLine());
            year++;
        }
        if (exclusions <= 1)
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrade / 12);
        else
            System.out.printf("%s has been excluded at %d grade", name, year - 1);
    }
}
