package Problems;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        var pagePrice = Double.parseDouble(scanner.nextLine());
        var coverPrice = Double.parseDouble(scanner.nextLine());
        var paperDiscount = Integer.parseInt(scanner.nextLine());
        var designerPrice = Double.parseDouble(scanner.nextLine());
        var finalDiscount = Integer.parseInt(scanner.nextLine());

        //price calculations
        double printingPrice = pagePrice * 899 + coverPrice * 2;
        printingPrice *= 1 - (paperDiscount * 1.0 / 100);
        double finalPrice = printingPrice + designerPrice;
        finalPrice *= 1 - (finalDiscount * 1.0 / 100);

        //output
        System.out.printf("Avtonom should pay %.2f BGN.", finalPrice);
    }
}
