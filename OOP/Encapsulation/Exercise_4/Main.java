package Encapsulation.Exercise_4;

// Main.java
// Main Class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee();

        // Set values using setter methods
        employee.setEmployee_id(15);
        employee.setEmployee_name("Caelius Dathan");
        employee.setEmployee_salary(4900.0);

        // Get values using getter methods
        int employeeId = employee.getEmployee_id();
        String employeeName = employee.getEmployee_name();
        String formattedSalary = employee.getFormattedSalary();

        // Print the values
        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + formattedSalary);
    }
}
