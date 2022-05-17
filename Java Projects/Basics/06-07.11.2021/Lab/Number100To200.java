package ConditionalStatements.Lab;

import java.util.Scanner;

public class Number100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var num = Integer.parseInt(scanner.nextLine());
        if (num < 100)
            System.out.println("Less than 100");
        if (100 <= num && num <= 200)
            System.out.println("Between 100 and 200");
        if (num > 200)
            System.out.println("Greater than 200");
    }
}
