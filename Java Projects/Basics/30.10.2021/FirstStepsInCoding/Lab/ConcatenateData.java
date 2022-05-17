package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        //Въвеждане на данни
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();
        //Извеждане съобщение
        System.out.printf("You are %s %s, a %d-years old from %s.", firstName, lastName, age, city);
    }
}
