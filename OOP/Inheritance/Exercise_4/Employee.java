package Inheritance.Exercise_4;

// Parent class Employee
public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Working as an employee!");
    }

    public int getSalary() {
        return salary;
    }
}
