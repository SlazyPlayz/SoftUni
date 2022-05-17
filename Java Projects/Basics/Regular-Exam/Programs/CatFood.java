package Problems;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        var cats = Integer.parseInt(scanner.nextLine());

        //counters
        int smallCats = 0;
        int bigCats = 0;
        int giganticCats = 0;
        double totalFood = 0;

        //amount calculations
        for (int i = 0; i < cats; i++) {
            var foodPerDay = Double.parseDouble(scanner.nextLine());
            totalFood += foodPerDay;

            if (foodPerDay >= 100 && foodPerDay < 200)
                smallCats++;
            else if (foodPerDay < 300)
                bigCats++;
            else if (foodPerDay < 400)
                giganticCats++;
        }

        //output
        System.out.printf("Group 1: %d cats.\n", smallCats);
        System.out.printf("Group 2: %d cats.\n", bigCats);
        System.out.printf("Group 3: %d cats.\n", giganticCats);
        System.out.printf("Price for food per day: %.2f lv.", totalFood / 1000 * 12.45);
    }
}
