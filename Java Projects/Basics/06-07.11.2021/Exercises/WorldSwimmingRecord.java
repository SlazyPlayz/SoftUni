package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double speed = Double.parseDouble(scanner.nextLine());
        double time = meters * speed + Math.floor(meters / 15) * 12.5;
        if (time < record)
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        else
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - record);
    }
}
