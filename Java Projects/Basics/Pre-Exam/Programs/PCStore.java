package Problems;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var cpuPrice = Double.parseDouble(scanner.nextLine());
        var gpuPrice = Double.parseDouble(scanner.nextLine());
        var ramPrice = Double.parseDouble(scanner.nextLine());
        var ramSticks = Integer.parseInt(scanner.nextLine());
        var discountPercentage = Double.parseDouble(scanner.nextLine());

        //Convert USD to BGN
        cpuPrice *= 1.57;
        gpuPrice *= 1.57;
        ramPrice *= 1.57;

        //Discount
        cpuPrice *= 1 - discountPercentage;
        gpuPrice *= 1 - discountPercentage;

        //final price
        double finalPrice = cpuPrice + gpuPrice + ramPrice * ramSticks;

        //output
        System.out.printf("Money needed - %.2f leva.", finalPrice);
    }
}
