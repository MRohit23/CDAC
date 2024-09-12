package Ass_3_sir;

import java.util.Scanner;

/*
Assignment no 4

Design Employee class
i) create instances
ii) create methods
iii) display details of employees 
Eg empid, name, address, salary
*/

class Employee{
	private String empName;
	private int empId;
	private float empSalary;
	private String empDesignation;
	private String empAddress;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name :");
		this.empName=sc.nextLine();
		System.out.println("Enter the employee Id");
		this.empId= sc.nextInt();
		System.out.println("enter the Employee Address:");
		this.empAddress=sc.next();
		
		System.out.println("Enter the employee salary");
		this.empSalary=sc.nextFloat();
		System.out.println("Enter the Designation :");
		this.empDesignation=sc.next();
		
	
		
	}
	
	public void printRecord() {
		System.out.println("********DetailsOfEmployee*************");
		System.out.println("Name:" +this.empName);
		System.out.println("Id:" +this.empId);
		System.out.println("Salary:"+this.empSalary);
		System.out.println("Designation:"+this.empDesignation);
		System.out.println("Address:"+this.empAddress);
		
		
	}
}






public class Ass4ShwetaMam {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.acceptRecord();
		emp.printRecord();

	}

}
