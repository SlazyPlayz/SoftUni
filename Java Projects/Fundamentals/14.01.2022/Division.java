package Lab;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var num = scanner.nextInt();
        int devNum = 0;

        if (num % 10 == 0)
            devNum = 10;
        else if (num % 7 == 0)
            devNum = 7;
        else if (num % 6 == 0)
            devNum = 6;
        else if (num % 3 == 0)
            devNum = 3;
        else if (num % 2 == 0)
            devNum = 2;

        if (devNum == 0)
            System.out.println("Not divisible");
        else
            System.out.printf("The number is divisible by %d", devNum);
    }
}
