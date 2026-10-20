package StreamOpreations.Employee;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOperations {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
          new Employee("damanjit", "SDE", 100000),
          new Employee("damanjit2", "Tester",60000),
        new Employee("damanjit3", "SDE", 80000),
        new Employee("damanjit4", "DevOps",90000),
        new Employee("damanjit5","Tester", 50000)
        );

//        Optional<EmployeeResponse> departmentSalaries = employees.stream()
//                .collect(
//                        Collectors.groupingBy(
//                                Employee::getDepartment,
//                                Collectors.summingInt(Employee::getSalary)
//                        )
//                ).entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue())
//                .map(e -> new EmployeeResponse(
//                        e.getKey(),
//                        e.getValue()));
//
//
//        departmentSalaries.ifPresent( d -> System.out.println("salary " + d.getSalary() + "department " + d.getDepartment()));
//

        List<EmployeeResponse> departmentSalaries = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summingInt(Employee::getSalary)
                        )
                ).entrySet()
                .stream()
                .map(e -> new EmployeeResponse(
                        e.getKey(),
                        e.getValue())).toList();

        departmentSalaries.forEach( d -> System.out.println("salary " + d.getSalary() + "department " + d.getDepartment()));

    }
}
