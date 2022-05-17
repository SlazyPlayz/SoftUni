package Lab;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = Integer.parseInt(scanner.nextLine());
        var b = Integer.parseInt(scanner.nextLine());
        var c = Integer.parseInt(scanner.nextLine());

        smallestOfThree(a, b, c);
    }

    static void smallestOfThree(int a, int b, int c) {
        int minNum = a;
        if (b < a) {
            if (c < b)
                minNum = c;
            else
                minNum = b;
        } else if (c < a)
            minNum = c;

        System.out.println(minNum);
    }
}
