package com.company;

import java.util.*;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String word1 = input[0];
        String word2 = input[1];

        int result = GetResult(word1, word2);
        System.out.println(result);
    }

    static int GetResult(String word1, String word2) {
        int longerWord = Math.max(word1.length(), word2.length());
        int shorterWord = Math.min(word1.length(), word2.length());
        char[] letters1 = word1.toCharArray();
        char[] letters2 = word2.toCharArray();
        int sum = 0;
        for (int i = 0; i < longerWord; i++) {
            if (i < shorterWord)
                sum += letters1[i] * letters2[i];
            else if (word1.length() > word2.length())
                sum += letters1[i];
            else
                sum += letters2[i];
        }
        return sum;
    }
}


