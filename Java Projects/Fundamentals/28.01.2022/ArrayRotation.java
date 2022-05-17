package Lab;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(numbers[i]);

        var rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            for (int j = 1; j < nums.length; j++) {
                int swapper = nums[nums.length - j];
                nums[nums.length - j] = nums[0];
                nums[0] = swapper;
            }
        }

        for (var num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}
