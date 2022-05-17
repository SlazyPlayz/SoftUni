package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            int sumBefore = 0;
            for (int j = 0; j < i; j++)
                sumBefore += nums[j];
            int sumAfter = 0;
            for (int k = i + 1; k < nums.length; k++)
                sumAfter += nums[k];
            if (sumBefore == sumAfter) {
                index = i;
                break;
            }
        }
        if (index != -1)
            System.out.println(index);
        else
            System.out.println("no");
    }
}
