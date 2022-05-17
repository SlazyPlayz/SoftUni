package Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String truePass = scanner.nextLine();
        String pass = scanner.nextLine();
        while (!pass.equals(truePass))
            pass = scanner.nextLine();
        System.out.printf("Welcome %s!", name);
    }
}
