package Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int num = i;
            if (num%10==0)
                continue;
            if (n % (num % 10) == 0) {
                num/=10;
                if (num%10==0)
                    break;
                if (n % (num%10)==0){
                    /*cmon bruh*/




                    num/=10;                                            //finish this
                    if (num%10==0)
                        break;
                    if (n % (num%10)==0) {
                        num/=10;
                        if (n % (num%10)==0)
                            System.out.printf("%d ", i);
                    }
                }
            }
        }
    }
}
