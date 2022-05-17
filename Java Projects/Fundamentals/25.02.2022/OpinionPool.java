package Exercise;

import java.util.Scanner;

public class OpinionPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var n = Integer.parseInt(scanner.nextLine());
        Person person = new Person();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            person.Name(input[0]);
            person.Age(Integer.parseInt(input[1]));

            if (person.ReturnAge() > 30)
                System.out.println(person.ReturnName() + " - " + person.ReturnAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public void Name(String name) {
        this.name = name;
    }

    public void Age(int age) {
        this.age = age;
    }

    public String ReturnName() {
        return name;
    }

    public int ReturnAge() {
        return age;
    }
}
