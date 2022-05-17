package Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (num > n)
                    break;
                System.out.printf("%d ", num);
                num++;
            }
            if (num > n)
                break;
            System.out.println();
        }
    }
}
