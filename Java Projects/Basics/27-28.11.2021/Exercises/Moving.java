package Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var width = Integer.parseInt(scanner.nextLine());
        var length = Integer.parseInt(scanner.nextLine());
        var height = Integer.parseInt(scanner.nextLine());
        int freeSpace = width * length * height;
        int takenSpace = 0;
        while (takenSpace < freeSpace) {
            String boxes = scanner.nextLine();
            if (boxes.equals("Done"))
                break;
            int currentBoxes = Integer.parseInt(boxes);
            takenSpace += currentBoxes;
        }
        if (takenSpace < freeSpace)
            System.out.printf("%d Cubic meters left.", freeSpace - takenSpace);
        else
            System.out.printf("No more free space! You need %d Cubic meters more.", takenSpace - freeSpace);
    }
}
