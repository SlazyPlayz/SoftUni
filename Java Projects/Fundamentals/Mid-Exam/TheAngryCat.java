package Problems;

import java.util.Scanner;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split(", ");
        int[] prices = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++)
            prices[i] = Integer.parseInt(inputArray[i]);
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        int sumLeft = 0;
        int sumRight = 0;
        if (type.equals("cheap")) {
            for (int i = 0; i < entryPoint; i++) {
                if (prices[i] < prices[entryPoint])
                    sumLeft += prices[i];
            }
            for (int i = entryPoint + 1; i < prices.length; i++) {
                if (prices[i] < prices[entryPoint])
                    sumRight += prices[i];
            }
        }
        if (type.equals("expensive")) {
            for (int i = 0; i < entryPoint; i++) {
                if (prices[i] >= prices[entryPoint])
                    sumLeft += prices[i];
            }
            for (int i = entryPoint + 1; i < prices.length; i++) {
                if (prices[i] >= prices[entryPoint])
                    sumRight += prices[i];
            }
        }
        if (sumLeft >= sumRight)
            System.out.println("Left - " + sumLeft);
        else
            System.out.println("Right - " + sumRight);
    }
}
