package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle = new Vehicle();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End"))
                break;
            String[] specifications = input.split(" ");
            vehicle.setType(specifications[0]);
            vehicle.setModel(specifications[1]);
            vehicle.setColor(specifications[2]);
            vehicle.setHorsepower(Integer.parseInt(specifications[3]));
        }

        vehicle.CarAndTruck();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Close the Catalogue"))
                break;
            vehicle.printVehicle(input);
        }

        vehicle.PrintAverage();
    }
}

class Vehicle {
    List<String> type = new ArrayList<>();
    List<String> model = new ArrayList<>();
    List<String> color = new ArrayList<>();
    List<Integer> horsepower = new ArrayList<>();

    double sumCars = 0.0;
    double sumTrucks = 0.0;
    int counterCars = 1;
    int counterTrucks = 1;

    public void setType(String type) {
        this.type.add(type);
    }

    public void setModel(String model) {
        this.model.add(model);
    }

    public void setColor(String color) {
        this.color.add(color);
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower.add(horsepower);
    }

    public void CarAndTruck() {
        for (int i = 0; i < type.size(); i++) {
            if (type.get(i).toLowerCase().equals("car")) {
                type.set(i, "Car");
                if (type.get(i).equals("Car")) {
                    sumCars += horsepower.get(i);
                    counterCars++;
                }
            }
            if (type.get(i).toLowerCase().equals("truck")) {
                type.set(i, "Truck");
                if (type.get(i).equals("Truck")) {
                    sumTrucks += horsepower.get(i);
                    counterTrucks++;
                }
            }
        }
    }

    public void printVehicle(String input) {
        for (int i = 0; i < model.size(); i++) {
            if (model.get(i).equals(input)) {
                System.out.println("Type: " + type.get(i));
                System.out.println("Model: " + model.get(i));
                System.out.println("Color: " + color.get(i));
                System.out.println("Horsepower: " + horsepower.get(i));
            }
        }
    }

    public void PrintAverage() {
        if (counterCars > 1)
            counterCars--;
        if (counterTrucks > 1)
            counterTrucks--;
        System.out.printf("Cars have average horsepower of: %.2f.", sumCars / counterCars);
        System.out.println();
        System.out.printf("Trucks have average horsepower of: %.2f.", sumTrucks / counterTrucks);
    }
}