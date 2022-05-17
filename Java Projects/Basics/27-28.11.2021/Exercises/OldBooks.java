package Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String neededBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int bookCounter = 0;
        boolean isFound = false;
        while (!currentBook.equals("No More Books")) {
            if (currentBook.equals(neededBook)) {
                isFound = true;
                break;
            } else {
                bookCounter++;
                currentBook = scanner.nextLine();
            }
        }
        if (isFound)
            System.out.printf("You checked %d books and found it.", bookCounter);
        else
            System.out.printf("The book you search is not here!\nYou checked %d books.", bookCounter);
    }
}