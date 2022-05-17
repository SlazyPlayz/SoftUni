package Lab;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            String[] elems = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                arr1[i] = Integer.parseInt(elems[0]);
                arr2[i] = Integer.parseInt(elems[1]);
            } else {
                arr1[i] = Integer.parseInt(elems[1]);
                arr2[i] = Integer.parseInt(elems[0]);
            }
        }

        for (var el : arr1)
            System.out.print(el + " ");
        System.out.println();

        for (var el : arr2)
            System.out.print(el + " ");
        System.out.println();
    }
}
