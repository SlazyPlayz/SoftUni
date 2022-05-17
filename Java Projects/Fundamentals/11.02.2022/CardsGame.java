package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> deckFirst = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deckSecond = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int smallerDeck = deckFirst.size();
        int sumFirst = 0;
        int sumSecond = 0;
        boolean isFirst = false;

        for (int i = 0; i < smallerDeck; i++) {
            if (deckSecond.size() == 0)
                isFirst = true;
            if (deckFirst.size() == 0 || deckSecond.size() == 0)
                break;
            if (deckFirst.get(i) > deckSecond.get(i))
                winner(deckFirst, deckSecond, i);
            else if (deckSecond.get(i) > deckFirst.get(i))
                winner(deckSecond, deckFirst, i);
            else {
                deckFirst.remove(i);
                deckSecond.remove(i);
            }
            i = -1;
            smallerDeck = Math.min(deckFirst.size(), deckSecond.size());
        }
        if (smallerDeck == deckSecond.size())
            isFirst = true;

        for (Integer el : deckFirst) {
            sumFirst += el;
        }
        for (Integer el : deckSecond) {
            sumSecond += el;
        }

        if (isFirst)
            System.out.println("First player wins! Sum: " + sumFirst);
        else
            System.out.println("Second player wins! Sum: " + sumSecond);
    }

    static void winner(List<Integer> firstDeck, List<Integer> secondDeck, int i) {
        int winningCard = firstDeck.get(i);
        int losingCard = secondDeck.get(i);
        firstDeck.remove(i);
        secondDeck.remove(i);
        firstDeck.add(winningCard);
        firstDeck.add(losingCard);
    }
}
