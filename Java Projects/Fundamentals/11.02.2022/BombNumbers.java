package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numberAndPower = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int number = numberAndPower.get(0);
        int power = numberAndPower.get(1);
        int sum = 0;

        while (nums.contains(number)) {
            int bombIndex = nums.indexOf(number);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if (start < 0)
                start = 0;
            if (end >= nums.size())
                end = nums.size() - 1;
            for (int i = start; i <= end; i++) {
                nums.remove(start);
            }
        }

        for (var num : nums)
            sum += num;

        System.out.println(sum);
    }
}
