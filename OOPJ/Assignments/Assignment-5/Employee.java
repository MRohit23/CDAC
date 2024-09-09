import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    
    // Static fields to track total employees and total salary expense
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;
    
    // Non-static fields for individual employee details
    private int id;
    private String name;
    private double salary;

    // Static initializer
    static {
        totalEmployees = 0;
        totalSalaryExpense = 0.0;
    }

    // Non-static initializer
    {
        id = ++totalEmployees; // Automatically assign a unique ID
    }

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalSalaryExpense += salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateSalary(double newSalary) {
        // Update total salary expense by adding the difference
        totalSalaryExpense += (newSalary - this.salary);
        this.salary = newSalary;
    }

    // Static method to get total employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Static method to apply a percentage raise to all employees
    public static void applyRaise(ArrayList<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            double newSalary = employee.salary + (employee.salary * percentage / 100);
            employee.updateSalary(newSalary);  // Update salary for each employee
        }
    }

    // Static method to calculate total salary expense
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // toString method for employee data representation
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

    // Main method with a menu-driven program to test the functionalities
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Apply Raise to All Employees");
            System.out.println("5. View Total Employees");
            System.out.println("6. View Total Salary Expense");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(name, salary));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.println("\n--- Employee List ---");
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    System.out.print("Enter employee ID to update salary: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.getId() == id) {
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter percentage raise: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(employees, percentage);
                    System.out.println("Raise applied successfully.");
                    break;

                case 5:
                    System.out.println("Total number of employees: " + Employee.getTotalEmployees());
                    break;

                case 6:
                    System.out.println("Total salary expense: " + Employee.calculateTotalSalaryExpense());
                    break;

                case 7:
                    exit = true;
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
