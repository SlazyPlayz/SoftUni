package Lab;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var startNum = Integer.parseInt(scanner.nextLine());
        var endNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            System.out.printf("%d ",i);
            sum += i;
        }

        System.out.printf("\nSum: %d", sum);
    }
}
