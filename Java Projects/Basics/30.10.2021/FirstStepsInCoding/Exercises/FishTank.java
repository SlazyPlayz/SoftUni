package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentTaken = Double.parseDouble(scanner.nextLine());
        percentTaken /= 100;
        double volume = length * width * height;
        volume /= 1000;
        double neededWater = volume * (1 - percentTaken);
        System.out.println(neededWater);
    }
}
