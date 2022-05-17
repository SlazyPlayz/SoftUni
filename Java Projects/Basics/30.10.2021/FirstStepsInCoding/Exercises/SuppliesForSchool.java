package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double detergentPrice = detergent * 1.20;
        double discountFinal = discount / 100.0;
        double finalPrice = (1 - discountFinal) * (pensPrice + markersPrice + detergentPrice);
        System.out.println(finalPrice);
    }
}
