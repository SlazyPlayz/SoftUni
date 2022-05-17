package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        var numGiven = Integer.parseInt(scanner.nextLine());

        int currentSum = nums[0];
        int indexStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (currentSum + nums[i] >)
        }
    }
}
