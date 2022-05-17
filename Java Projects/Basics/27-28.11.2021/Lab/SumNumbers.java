package Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var num = Integer.parseInt(scanner.nextLine());
        var sum = Integer.parseInt(scanner.nextLine());
        while (sum < num) {
            var n = Integer.parseInt(scanner.nextLine());
            sum += n;
        }
        System.out.println(sum);
    }
}
