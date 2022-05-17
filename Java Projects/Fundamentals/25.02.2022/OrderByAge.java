package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PersonInfo person = new PersonInfo();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End"))
                break;
            String[] info = input.split(" ");
            person.setName(info[0]);
            person.setId(info[1]);
            person.setAge(Integer.parseInt(info[2]));
        }

        person.DuplicateList();
        person.sortByAge();
        person.Output();
    }
}

class PersonInfo {
    List<String> name = new ArrayList<>();
    List<String> id = new ArrayList<>();
    List<Integer> age = new ArrayList<>();

    List<String> nameSorted = new ArrayList<>();
    List<String> idSorted = new ArrayList<>();
    List<Integer> ageSorted = new ArrayList<>();

    public void setName(String name) {
        this.name.add(name);
    }

    public void setId(String id) {
        this.id.add(id);
    }

    public void setAge(Integer age) {
        this.age.add(age);
    }

    int minAge() {
        int minAge = age.get(0);
        for (int i = 0; i < age.size(); i++) {
            if (minAge > age.get(i))
                minAge = age.get(i);
        }
        return minAge;
    }

    List<Integer> ageDublicate = new ArrayList<>();

    public void DuplicateList() {
        for (int num : age)
            ageDublicate.add(num);
    }

    public void sortByAge() {
        while (age.size() > 0) {
            ageSorted.add(minAge());
            age.remove(age.indexOf(minAge()));
        }
        for (int i = 0; i < ageSorted.size(); i++) {
            int index = ageDublicate.indexOf(ageSorted.get(i));
            nameSorted.add(name.get(index));
            idSorted.add(id.get(index));
        }
    }

    public void Output() {
        for (int i = 0; i < nameSorted.size(); i++) {
            System.out.printf("%s with ID: %s is %d years old.", nameSorted.get(i), idSorted.get(i), ageSorted.get(i));
            System.out.println();
        }
    }
}