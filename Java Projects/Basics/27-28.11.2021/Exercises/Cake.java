package Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var width = Integer.parseInt(scanner.nextLine());
        var length = Integer.parseInt(scanner.nextLine());
        int totalPieces = width * length;
        int takenPieces = 0;
        while (takenPieces < totalPieces) {
            var pieces = scanner.nextLine();
            if (pieces.equals("STOP"))
                break;
            int currentPieces = Integer.parseInt(pieces);
            takenPieces += currentPieces;
        }
        if (takenPieces >= totalPieces)
            System.out.printf("No more cake left! You need %d pieces more.", takenPieces - totalPieces);
        else
            System.out.printf("%d pieces are left.", totalPieces - takenPieces);
    }
}
