import java.util.*;
import java.util.stream.*;

public class PerDepartmentEmp
{
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 70000),
                new Employee("Bob", "HR", 50000),
                new Employee("Carol", "IT", 80000)
        );


        Map<String, List<String>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        LinkedHashMap::new,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(result);
    }

}

class Employee{
    private String name;
    private String department;
    private int salary;
    Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public String getDepartment(){
        return this.department;
    }
    public int getSalary(){
        return this.salary;
    }
}