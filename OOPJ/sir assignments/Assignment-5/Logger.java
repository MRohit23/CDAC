import java.util.Scanner;

public class Logger {
    
    // Static field to hold the single instance of Logger (singleton)
    private static Logger instance;
    
    // Non-static field for storing log messages
    private StringBuilder logMessages;

    // Static initializer to initialize the static instance
    static {
        instance = null; // Logger instance will be initialized on demand
    }

    // Non-static initializer to initialize logMessages when a Logger instance is created
    {
        logMessages = new StringBuilder();
    }

    // Private constructor to prevent direct instantiation
    private Logger() { }

    // Static method to get the single instance of Logger (singleton pattern)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to add a log message
    public void log(String message) {
        logMessages.append(message).append("\n");
    }

    // Method to return all log messages as a String
    public String getLog() {
        return logMessages.toString();
    }

    // Method to clear all log messages
    public void clearLog() {
        logMessages.setLength(0); // Clear the log
    }

    // toString method to return current log messages
    @Override
    public String toString() {
        return "Logger Messages:\n" + logMessages.toString();
    }

    // Main method with menu-driven program to test Logger functionalities
    public static void main(String[] args) {
        Logger logger = Logger.getInstance(); // Get the singleton instance
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Logger Menu ---");
            System.out.println("1. Add Log Message");
            System.out.println("2. View Log");
            System.out.println("3. Clear Log");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter log message: ");
                    String message = scanner.nextLine();
                    logger.log(message);
                    System.out.println("Log added successfully.");
                    break;

                case 2:
                    System.out.println("\n--- Current Log ---");
                    System.out.println(logger.getLog());
                    break;

                case 3:
                    logger.clearLog();
                    System.out.println("Log cleared successfully.");
                    break;

                case 4:
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
