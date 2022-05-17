package Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        if (10 <= hour && hour <= 18) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");
            }
        } else
            System.out.println("closed");
    }
}
