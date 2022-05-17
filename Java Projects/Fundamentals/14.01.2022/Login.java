package Lab;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int failCounter = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            password += symbol;
        }

        while (true) {
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(password))
                break;
            failCounter++;
            if (failCounter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }
        if (failCounter < 4)
            System.out.printf("User %s logged in.", username);
    }
}