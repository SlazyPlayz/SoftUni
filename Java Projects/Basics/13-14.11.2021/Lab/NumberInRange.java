package Lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var num = Double.parseDouble(scanner.nextLine());
        if (-100 <= num && num <= 100 && num != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
