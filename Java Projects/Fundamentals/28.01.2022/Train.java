package Lab;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());

        int[] passengers = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            passengers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (var passenger : passengers) {
            System.out.print(passenger + " ");
            sum += passenger;
        }
        System.out.println();
        System.out.println(sum);
    }
}
