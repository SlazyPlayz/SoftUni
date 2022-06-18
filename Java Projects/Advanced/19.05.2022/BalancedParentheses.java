package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        ArrayDeque<Character> firstBrackets = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i < input.length; i++) {
            char currentBracket = input[i];
            if (currentBracket == '{' || currentBracket == '[' || currentBracket == '(')
                firstBrackets.push(currentBracket);
            else {
                if (firstBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastOpBracket = firstBrackets.pop();
                if (currentBracket == '}' && lastOpBracket != '{')
                    isBalanced = false;
                else if (currentBracket == ']' && lastOpBracket != '[')
                    isBalanced = false;
                else if (currentBracket == ')' && lastOpBracket != '(')
                    isBalanced = false;
            }
        }

        if (input.length % 2 != 0)
            isBalanced = false;

        if (isBalanced && firstBrackets.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

    /*public static void main(String[] args) { //I wanted to use both stacks and queues for this exercise
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (var el : input) {
            if (el == '{' || el == '[' || el == '(')
                stack.push(el);
            else
                queue.add(el);
        }

        boolean areEqual = SameLength(stack, queue) && (AreEqualSpaced(stack, queue) || AreEqualTogether(stack, queue)) && EndsWithClosed(input);

        if (areEqual)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean EndsWithClosed(char[] input) {
        char bracket = input[input.length - 1];
        boolean isTrue = false;
        if (bracket == '}' || bracket == ']' || bracket == ')')
            isTrue = true;
        return isTrue;
    }

    private static boolean AreEqualSpaced(ArrayDeque<Character> stack, ArrayDeque<Character> queue) {
        ArrayDeque<Character> internalStack = new ArrayDeque<>(stack);
        ArrayDeque<Character> internalQueue = new ArrayDeque<>(queue);
        boolean isTrue = true;

        for (var el : internalStack) {
            char bracket = internalQueue.poll();
            boolean firstBracket = el == '{' && bracket == '}';
            boolean secondBracket = el == '[' && bracket == ']';
            boolean thirdBracket = el == '(' && bracket == ')';
            if (!firstBracket && !secondBracket && !thirdBracket)
                isTrue = false;
        }

        return isTrue;
    }

    private static boolean AreEqualTogether(ArrayDeque<Character> stack, ArrayDeque<Character> queue) {
        ArrayDeque<Character> internalStack = new ArrayDeque<>(stack);
        ArrayDeque<Character> queueIntoStack = new ArrayDeque<>();

        boolean isTrue = true;

        for (var el : queue) {
            queueIntoStack.push(el);
        }

        for (var el : internalStack) {
            char bracket = queueIntoStack.pop();
            boolean firstBracket = el == '{' && bracket == '}';
            boolean secondBracket = el == '[' && bracket == ']';
            boolean thirdBracket = el == '(' && bracket == ')';
            if (!firstBracket && !secondBracket && !thirdBracket)
                isTrue = false;
        }

        return isTrue;
    }

    private static boolean SameLength(ArrayDeque<Character> stack, ArrayDeque<Character> queue) {
        ArrayDeque<Character> stackCheck = new ArrayDeque<>(stack);
        ArrayDeque<Character> queueCheck = new ArrayDeque<>(queue);

        for (var el : stack)
            stackCheck.push(el);
        for (var el : queue)
            queueCheck.add(el);

        boolean isTrue = true;

        while (!stackCheck.isEmpty() && !queueCheck.isEmpty()) {
            stackCheck.pop();
            queueCheck.poll();
        }

        if (!stackCheck.isEmpty() || !queueCheck.isEmpty())
            isTrue = false;

        return isTrue;
    }*/
