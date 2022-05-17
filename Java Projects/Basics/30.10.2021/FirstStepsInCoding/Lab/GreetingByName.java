package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        //Въвеждане на име
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //Принтиране на поздрав
        System.out.println("Hello, " + name + "!");
    }
}
