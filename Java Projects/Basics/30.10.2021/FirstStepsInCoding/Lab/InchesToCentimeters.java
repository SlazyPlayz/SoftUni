package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        //Прочитане на входни данни
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        //Пресмятания (Конвертиране от инчове в сантиметри)
            //1 инч = 2,54 см
        double cm = inch*2.54;
        //Принтиране на резултата (в сантиметри)
        System.out.println(cm);
    }
}
