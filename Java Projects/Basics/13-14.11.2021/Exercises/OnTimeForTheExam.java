package Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var testHour = Integer.parseInt(scanner.nextLine());
        var testMinute = Integer.parseInt(scanner.nextLine());
        var arrivalHour = Integer.parseInt(scanner.nextLine());
        var arrivalMinute = Integer.parseInt(scanner.nextLine());
        var diff = testHour * 60 + testMinute - arrivalHour * 60 - arrivalMinute;
        int diffhour;
        int diffmin;
        if (diff > 30)
            System.out.println("Early");
        else if (diff >= 0)
            System.out.println("On time");
        else
            System.out.println("Late");
        if (diff >= 60) {
            diffhour = diff / 60;
            diffmin = diff % 60;
            if (diffmin < 10)
                System.out.printf("%d:0%d hours before the start", diffhour, diffmin);
            else
                System.out.printf("%d:%d hours before the start", diffhour, diffmin);
        } else if (-diff >= 60) {
            diffhour = Math.abs(diff / 60);
            diffmin = Math.abs(diff % 60);
            if (diffmin < 10)
                System.out.printf("%d:0%d hours after the start", diffhour, diffmin);
            else
                System.out.printf("%d:%d hours after the start", diffhour, diffmin);
        } else if (diff > 0)
            System.out.println(diff + " minutes before the start");
        else if (diff < 0)
            System.out.println(Math.abs(diff) + " minutes after the start");
    }
}
