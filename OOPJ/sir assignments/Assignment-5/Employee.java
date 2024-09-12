import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    // Static fields to keep track of the total number of employees and total salary expense
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    // Non-static fields for individual employee details
    private int id;
    private String name;
    private double salary;

    // Static initializer block
    static {
        totalEmployees = 0;
        totalSalaryExpense = 0.0;
    }

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    // Static method to get the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Static method to apply a percentage raise to the salary of all employees
    public static void applyRaise(double percentage) {
        // Iterate through the list of employees and apply raise
        for (Employee employee : employees) {
            double newSalary = employee.salary + (employee.salary * percentage / 100);
            totalSalaryExpense += (newSalary - employee.salary);
            employee.salary = newSalary;
        }
    }

    // Static method to calculate the total salary expense
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // Method to update the salary of an individual employee
    public void updateSalary(double newSalary) {
        totalSalaryExpense += (newSalary - this.salary);
        this.salary = newSalary;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to provide a string representation of an employee
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }

    // List to store all employees (for applying raises)
    private static List<Employee> employees = new ArrayList<>();

    // Main method with menu-driven program to test the functionalities
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Apply Raise to All Employees");
            System.out.println("3. Show Total Number of Employees");
            System.out.println("4. Show Total Salary Expense");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a new employee
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    Employee newEmployee = new Employee(id, name, salary);
                    employees.add(newEmployee);
                    System.out.println("Employee added: " + newEmployee);
                    break;

                case 2:
                    // Apply raise to all employees
                    System.out.print("Enter percentage raise: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(percentage);
                    System.out.println("Raise applied to all employees.");
                    break;

                case 3:
                    // Show total number of employees
                    System.out.println("Total number of employees: " + Employee.getTotalEmployees());
                    break;

                case 4:
                    // Show total salary expense
                    System.out.println("Total salary expense: $" + Employee.calculateTotalSalaryExpense());
                    break;

                case 5:
                    // Update salary of an individual employee
                    System.out.print("Enter employee ID to update salary: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.getId() == updateId) {
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated: " + emp);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + updateId + " not found.");
                    }
                    break;

                case 6:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
