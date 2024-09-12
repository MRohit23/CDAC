import java.util.Scanner;

public class InstanceCounter {

    // Static field to track the total number of instances
    private static int totalInstances = 0;
    
    // Non-static field for each instance's unique ID
    private int instanceID;

    // Static initializer block
    static {
        totalInstances = 0; // Initializing the static counter
    }

    // Non-static initializer block
    {
        instanceID = ++totalInstances; // Assign a unique ID to each instance
    }

    // Constructor
    public InstanceCounter() {
        // Constructor logic (if any additional initialization is needed)
    }

    // Static method to get the total number of instances created
    public static int getTotalInstances() {
        return totalInstances;
    }

    // Getter method for the individual instance ID
    public int getInstanceID() {
        return instanceID;
    }

    // toString method to provide details about each instance
    @Override
    public String toString() {
        return "Instance ID: " + instanceID + " (Total instances: " + totalInstances + ")";
    }

    // Main method with a menu-driven program to test the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Instance Counter Menu ---");
            System.out.println("1. Create a new instance");
            System.out.println("2. Show total number of instances");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create a new instance of InstanceCounter
                    InstanceCounter newInstance = new InstanceCounter();
                    System.out.println("New instance created: " + newInstance);
                    break;

                case 2:
                    // Display total number of instances
                    System.out.println("Total number of instances created: " + InstanceCounter.getTotalInstances());
                    break;

                case 3:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
