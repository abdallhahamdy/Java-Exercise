package Inheritance.Exercise_10;

// Employee.java

public class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double calculateBonus() {
        // Default implementation for bonus calculation
        return 0.0;
    }

    public String generatePerformanceReport() {
        // Default implementation for performance report
        return "No performance report available.";
    }
}
