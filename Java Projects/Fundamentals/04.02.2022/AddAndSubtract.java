package Lab;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = Integer.parseInt(scanner.nextLine());
        var b = Integer.parseInt(scanner.nextLine());
        var c = Integer.parseInt(scanner.nextLine());

        int result = Add(a, b);
        result = Subtract(result, c);

        System.out.println(result);
    }

    static int Add(int a, int b) {
        return a + b;
    }

    static int Subtract(int a, int b) {
        return a - b;
    }
}
