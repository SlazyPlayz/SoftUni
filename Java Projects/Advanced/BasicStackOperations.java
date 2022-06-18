package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] elements = scanner.nextLine().split(" ");

        var n = Integer.parseInt(input[0]);
        var s = Integer.parseInt(input[1]);
        var x = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(elements[i]));
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x))
            System.out.println(true);
        else if (!stack.isEmpty()) {
            int smallest = stack.peek();
            for (var el : stack) {
                if (el < smallest)
                    smallest = el;
            }
            System.out.println(smallest);
        } else
            System.out.println(0);
    }
}
