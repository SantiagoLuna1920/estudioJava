package lambdasAndStreams17.streamEmployeeManipulations;

import java.util.Arrays;
import java.util.List;

public class ProcessingEmployees {
    public static void main(String[] args) {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // display all Employees
        System.out.println("Complete Employee list:");
        Arrays.stream(employees).forEach(System.out::println);

        System.out.println();
        System.out.println("Complete Employee list with List employee:");
        List<Employee> list = Arrays.asList(employees);
        list.forEach(System.out::println);

        List<Employee> employeeFilter = list.stream().filter((Employee employee) -> employee.getSalary()>5000).toList();

        System.out.println();
        System.out.println("Employee filter and map");
      employeeFilter.forEach(System.out::println);

    }
}
