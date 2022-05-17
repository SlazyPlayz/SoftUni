package Lab;

public class Clock {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        while (hours < 24) {
            while (minutes < 60) {
                System.out.printf("%d:%d\n", hours, minutes);
                minutes++;
            }
            minutes = 0;
            hours++;
        }
    }
}
