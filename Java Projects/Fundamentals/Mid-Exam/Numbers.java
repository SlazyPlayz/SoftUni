package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> inputList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        List<Integer> nums = new ArrayList<>();
        for (var item : inputList)
            nums.add(Integer.parseInt(item));
        String comInput = scanner.nextLine();
        while (!comInput.equals("Finish")) {
            String command = comInput.split(" ")[0];
            int value = Integer.parseInt(comInput.split(" ")[1]);
            switch (command) {
                case "Add":
                    nums.add(value);
                    break;
                case "Remove":
                    int position = nums.indexOf(value);
                    nums.remove(position);
                    break;
                case "Replace":
                    int replacementValue = Integer.parseInt(comInput.split(" ")[2]);
                    position = nums.indexOf(value);
                    nums.set(position, replacementValue);
                    break;
                case "Collapse":
                    for (int j = 0; j < nums.size(); j++) {
                        int num = nums.get(j);
                        position = nums.indexOf(num);
                        if (num < value) {
                            nums.remove(position);
                            j--;
                        }
                    }
                    break;
            }
            comInput = scanner.nextLine();
        }
        for (var num : nums)
            System.out.print(num + " ");
    }
}