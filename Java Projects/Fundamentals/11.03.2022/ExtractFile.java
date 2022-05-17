package com.company;

import java.util.*;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int indexOfSlash = input.lastIndexOf('\\');
        int indexOfDot = input.lastIndexOf('.');

        String fileName = input.substring(indexOfSlash + 1, indexOfDot);
        String fileExtension = input.substring(indexOfDot + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
