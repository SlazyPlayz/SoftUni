package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int longestSequenceNumber = nums[0];
        int longestSequenceCounter = 0;

        int currentNum = nums[0];
        int currentCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == currentNum)
                currentCounter++;
            else {
                if (currentCounter > longestSequenceCounter) {
                    longestSequenceNumber = currentNum;
                    longestSequenceCounter = currentCounter;
                }
                currentNum = nums[i];
                currentCounter = 1;
            }
            if (i == nums.length - 1) {
                if (currentCounter > longestSequenceCounter) {
                    longestSequenceNumber = currentNum;
                    longestSequenceCounter = currentCounter;
                }
            }
        }
        for (int i = 0; i < longestSequenceCounter; i++)
            System.out.print(longestSequenceNumber + " ");
    }
}
