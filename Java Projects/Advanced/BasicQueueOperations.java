package Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        var n = Integer.parseInt(input[0]);
        var s = Integer.parseInt(input[1]);
        var x = Integer.parseInt(input[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++)
            queue.add(nums[i]);
        for (int i = 0; i < s; i++)
            queue.poll();
        if (queue.contains(x))
            System.out.println(true);
        else if (!queue.isEmpty())
            System.out.println(PrintMin(queue));
        else
            System.out.println(0);
    }

    private static int PrintMin(ArrayDeque<Integer> queue) {
        int min = queue.peek();
        for (var el : queue) {
            if (el < min)
                min = el;
        }
        return min;
    }
}
