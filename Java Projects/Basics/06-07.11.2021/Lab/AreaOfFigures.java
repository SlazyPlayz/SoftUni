package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var figure = scanner.nextLine();
        double a;
        double b;
        double s = 0.000;
        if (figure.equals("square")) {
            a = Double.parseDouble(scanner.nextLine());
            s = a * a;
            //s = (double) Math.round(a * a * 1000d) / 1000d;
        }
        if (figure.equals("rectangle")) {
            a = Double.parseDouble(scanner.nextLine());
            b = Double.parseDouble(scanner.nextLine());
            s = a * b;
        }
        if (figure.equals("circle")) {
            a = Double.parseDouble(scanner.nextLine());
            s = Math.PI * a * a;
        }
        if (figure.equals("triangle")) {
            a = Double.parseDouble(scanner.nextLine());
            b = Double.parseDouble(scanner.nextLine());
            s = a * b / 2;
        }
        System.out.printf("%.3f", s);
    }
}
