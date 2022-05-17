package Problems;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        String teamName = scanner.nextLine();
        String souvenirType = scanner.nextLine();
        var souvenirAmount = Integer.parseInt(scanner.nextLine());
        double souvenirPrice = 0;
        boolean validCountry = true;
        boolean validStock = true;

        //determine souvenir price
        switch (teamName) {
            case "Argentina":
                switch (souvenirType) {
                    case "flags":
                        souvenirPrice = 3.25;
                        break;
                    case "caps":
                        souvenirPrice = 7.20;
                        break;
                    case "posters":
                        souvenirPrice = 5.10;
                        break;
                    case "stickers":
                        souvenirPrice = 1.25;
                        break;
                    default:
                        validStock = false;
                }
                break;
            case "Brazil":
                switch (souvenirType) {
                    case "flags":
                        souvenirPrice = 4.20;
                        break;
                    case "caps":
                        souvenirPrice = 8.50;
                        break;
                    case "posters":
                        souvenirPrice = 5.35;
                        break;
                    case "stickers":
                        souvenirPrice = 1.20;
                        break;
                    default:
                        validStock = false;
                }
                break;
            case "Croatia":
                switch (souvenirType) {
                    case "flags":
                        souvenirPrice = 2.75;
                        break;
                    case "caps":
                        souvenirPrice = 6.90;
                        break;
                    case "posters":
                        souvenirPrice = 4.95;
                        break;
                    case "stickers":
                        souvenirPrice = 1.10;
                        break;
                    default:
                        validStock = false;
                }
                break;
            case "Denmark":
                switch (souvenirType) {
                    case "flags":
                        souvenirPrice = 3.10;
                        break;
                    case "caps":
                        souvenirPrice = 6.50;
                        break;
                    case "posters":
                        souvenirPrice = 4.80;
                        break;
                    case "stickers":
                        souvenirPrice = 0.90;
                        break;
                    default:
                        validStock = false;
                }
                break;
            default:
                validCountry = false;
        }

        //output
        if (validCountry && validStock)
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirAmount, souvenirType, teamName, souvenirPrice * souvenirAmount);
        else if (validCountry)
            System.out.println("Invalid stock!");
        else
            System.out.println("Invalid country!");
    }
}
