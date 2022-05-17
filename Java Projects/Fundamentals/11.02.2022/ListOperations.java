package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> nums = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String comd = scanner.nextLine();
            if (comd.equals("End"))
                break;
            String[] command = comd.split("\\s+");
            String operation = command[0];
            switch (operation) {
                case "Add":
                    nums.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (index < nums.size() && index >= 0)
                        nums.add(index, Integer.parseInt(command[1]));
                    else
                        System.out.println("Invalid index");
                    break;
                case "Remove":
                    index = Integer.parseInt(command[1]);
                    if (index < 0 || index >= nums.size())
                        System.out.println("Invalid index");
                    else
                        nums.remove(index);
                    break;
                case "Shift":
                    String direction = command[1];
                    int shifts = Integer.parseInt(command[2]);
                    if (direction.equals("left")) {
                        for (int i = 0; i < shifts; i++) {
                            int firstNum = nums.get(0);
                            for (int j = 0; j < nums.size() - 1; j++) {
                                nums.set(j, nums.get(j + 1));
                            }
                            nums.remove(nums.size() - 1);
                            nums.add(firstNum);
                        }
                    } else if (direction.equals("right")) {
                        for (int i = 0; i < shifts; i++) {
                            int lastNum = nums.get(nums.size() - 1);
                            for (int j = nums.size() - 1; j > 0; j--)
                                nums.set(j, nums.get(j - 1));
                            nums.remove(0);
                            nums.add(0, lastNum);
                        }
                    }
                    break;
            }
        }
        for (Integer num : nums)
            System.out.print(num + " ");
    }
}
