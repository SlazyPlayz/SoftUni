package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (input[0].equals("1"))
                stack.push(Integer.parseInt(input[1]));
            else if (input[0].equals("2"))
                stack.pop();
            else
                System.out.println(PrintMax(stack));
        }
    }

    private static int PrintMax(ArrayDeque<Integer> stack) {
        int max = stack.peek();
        for (var el : stack) {
            if (el > max)
                max = el;
        }
        return max;
    }
}
