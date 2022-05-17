package Lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var num = Double.parseDouble(scanner.nextLine());
        boolean isValid = (num >= 100) && (num <= 200) || (num == 0);
        if (!isValid)
            System.out.println("invalid");
    }
}
