package Lab;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int[] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++)
            nums[i] = Integer.parseInt(numbers[i]);

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    counter++;
                else {
                    counter = 0;
                    break;
                }
                if (j == nums.length - 1 && counter != 0)
                    System.out.print(nums[i] + " ");
            }
        }
        System.out.print(nums[nums.length - 1]);
        System.out.println();
    }
}
