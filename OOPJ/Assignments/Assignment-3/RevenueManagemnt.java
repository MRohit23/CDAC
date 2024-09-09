package Ass_3_sir;

import java.util.Scanner;

/*
5. Toll Booth Revenue Management 
Develop a system to simulate a toll booth for collecting revenue. The system should: 
1. Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle. 
2. Accept the number of vehicles of each type passing through the toll booth. 
3. Calculate the total revenue based on the toll rates and number of vehicles. 
4. Display the total number of vehicles and the total revenue collected, in Indian Rupees 
(₹). 
Toll Rate Examples: 
Car: ₹50.00 
Truck: ₹100.00 
Motorcycle: ₹30.00 
ASSIGNMENT NO.3 
Define class TollBoothRevenueManager with methods 
acceptRecord, setTollRates, calculateRevenue & printRecord and test the functionality in 
main method
*/

class ToolBooth {

	private double carTollRate;
	private double truckTollRate;
	private double motorcycleTollRate;
	private int carCount;
	private int truckCount;
	private int motorcycleCount;
	private double totalRevenue;
	private int totalVehicles;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cars:");
		this.carCount = sc.nextInt();
		System.out.println("Enter the number of trucks :");
		this.truckCount = sc.nextInt();
		System.out.println("Enter the number of motorcycles:");
		this.motorcycleCount = sc.nextInt();

	}

	public void setTollRates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the toll rate for car :");
		this.carTollRate = sc.nextDouble();
		System.out.println("Enter the truck toll rate:");
		this.truckTollRate = sc.nextDouble();
		System.out.println("Enter the motorcycle toll rate ");
		this.motorcycleTollRate = sc.nextDouble();

	}

	public void calculateRevenue() {
		totalRevenue = (carCount * carTollRate) + (truckCount * truckTollRate) + (motorcycleCount * motorcycleTollRate);
	}

	public void printRecord() {
		this.totalVehicles = carCount + truckCount + motorcycleCount;
		System.out.printf("number of vehicles:%d\n", totalVehicles);
		System.out.printf("number revenue:%.2f\n", totalRevenue);
	}
}

public class RevenueManagemnt {

	public static void main(String[] args) {
		ToolBooth tb=new ToolBooth();
		tb.setTollRates();
		tb.acceptRecord();
		tb.calculateRevenue();
		tb.printRecord();

	}

}