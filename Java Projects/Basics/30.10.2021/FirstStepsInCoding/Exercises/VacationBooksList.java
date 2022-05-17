package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPages = Integer.parseInt(scanner.nextLine());
        int hourlyPages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPages = totalPages/hourlyPages/days;
        System.out.println(dailyPages);
    }
}
