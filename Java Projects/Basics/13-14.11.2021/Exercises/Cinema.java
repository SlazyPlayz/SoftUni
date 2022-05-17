package Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projType = scanner.nextLine();
        var r = Integer.parseInt(scanner.nextLine());
        var c = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (projType.equals("Premiere"))
            price = 12.0;
        if (projType.equals("Normal"))
            price = 7.50;
        if (projType.equals("Discount"))
            price = 5.0;
        System.out.printf("%.2f leva", price * r * c);
    }
}
