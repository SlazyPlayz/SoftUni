package Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        var sales = Double.parseDouble(scanner.nextLine());
        double commission = Integer.MIN_VALUE;
        boolean isValid = false;
        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500)
                    commission = 5;
                else if (sales <= 1000)
                    commission = 7;
                else if (sales <= 10000)
                    commission = 8;
                else
                    commission = 12;
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500)
                    commission = 5.5;
                else if (sales <= 1000)
                    commission = 8;
                else if (sales <= 10000)
                    commission = 12;
                else
                    commission = 14.5;
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500)
                    commission = 4.5;
                else if (sales <= 1000)
                    commission = 7.5;
                else if (sales <= 10000)
                    commission = 10;
                else
                    commission = 13;
                break;
        }
        if (city.equals("Sofia") || city.equals("Plovdiv") || city.equals("Varna")) {
            if(sales >= 0)
                isValid = true;
        }
        if(!isValid)
            System.out.println("error");
        else
            System.out.printf("%.2f", sales * commission / 100);
    }
}
