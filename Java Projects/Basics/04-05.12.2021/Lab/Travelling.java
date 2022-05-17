package Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String destination = scanner.nextLine();
            if (destination.equals("End"))
                break;
            var budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < budget) {
                var money = Double.parseDouble(scanner.nextLine());
                sum += money;
            }
            if (sum >= budget)
                System.out.printf("Going to %s!\n", destination);
        }
    }
}
