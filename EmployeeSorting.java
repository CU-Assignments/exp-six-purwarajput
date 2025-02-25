import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", $" + salary;
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Purwa", 20, 90000),
                new Employee("Prateek", 25, 70000),
                new Employee("Prince", 35, 60000),
                new Employee("Neetu", 28, 80000)
        );

        employees.sort(Comparator.comparing(emp -> emp.name));
        System.out.println("Sorted by Name: " + employees);

        employees.sort(Comparator.comparingInt(emp -> emp.age));
        System.out.println("Sorted by Age: " + employees);

        employees.sort(Comparator.comparingDouble(emp -> -emp.salary));
        System.out.println("Sorted by Salary (Descending): " + employees);
    }
}
