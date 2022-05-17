package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearlyPrice = Integer.parseInt(scanner.nextLine());
        double trainers = 0.6 * yearlyPrice;
        double tracksuit = 0.8 * trainers;
        double ball = 0.25 * tracksuit;
        double accessories = 0.2 * ball;
        double total = trainers + tracksuit + ball + accessories + yearlyPrice;
        System.out.println(total);
    }
}
