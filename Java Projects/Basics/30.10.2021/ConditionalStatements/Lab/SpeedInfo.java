package ConditionalStatements.Lab;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var num = Double.parseDouble(scanner.nextLine());
        if (num <= 10)
            System.out.println("slow");
        if (num > 10 && num <= 50)
            System.out.println("average");
        if (num > 50 && num <= 150)
            System.out.println("fast");
        if (num > 150 && num <= 1000)
            System.out.println("ultra fast");
        if (num > 1000)
            System.out.println("extremely fast");
    }
}
