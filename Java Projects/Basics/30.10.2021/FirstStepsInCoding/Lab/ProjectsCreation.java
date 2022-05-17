package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} projects."
        //Въвеждане
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        //Изход
        System.out.println("The architect " + name + " will need " + (projects * 3) + " hours to complete " + projects + " project/s.");
    }
}
