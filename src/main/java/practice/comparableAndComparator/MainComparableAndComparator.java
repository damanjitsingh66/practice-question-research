package practice.comparableAndComparator;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparableAndComparator {

    //comparable is used to defined the natural ordering of objets.
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(31,"vaneet",26));
        employees.add(new Employee(24,"gagan",34));
        employees.add(new Employee(34,"rohan",23));

        Collections.sort(employees);
        System.out.println("id wise");
        for(Employee e : employees) {
            System.out.println(e.getId() + " - "+e.getName());
        }
  //comparator is used for define the custom ordering of objects
        Comparator<Employee> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        employees.sort(nameComparator);
        System.out.println("name wise");
        for(Employee e : employees) {
            System.out.println(e.getId() + " - "+e.getName());
        }

        System.out.println("age wise");
        Comparator<Employee> byAge = Comparator.comparingInt(Employee::getAge);
             employees.sort(byAge);
        for(Employee e : employees) {
            System.out.println(e.getId() + " - "+e.getName());
        }

    }
}
