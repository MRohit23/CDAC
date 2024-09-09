package Ass_3_sir;

//Develop a system to compute the future value of an investment with compound interest. The 
//system should: 
//1. Accept the initial investment amount, annual interest rate, number of times the 
//interest is compounded per year, and investment duration (in years) from the user. 
//2. Calculate the future value of the investment using the formula: 
//Future Value Calculation: 
// futureValue = principal * (1 + annualInterestRate / 
//numberOfCompounds)^(numberOfCompounds * years)
// Total Interest Earned: 
//totalInterest = futureValue - principal
// 3. Display the future value and the total interest earned, in Indian Rupees (₹). 
//Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, 
//printRecord and test the functionality in main method

import java.util.*;

class CompoundInterest{
	private double principal;
	private double annualInterestRate;
	private int numberTimeCompoundPerYear;
	private int investmentDuration;
	
	 public void acceptRecord() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the principal amount(rs):");
		 principal=sc.nextDouble();
		 
		 System.out.println("enter the annual interest rate :");
		 annualInterestRate= sc.nextDouble();
		 
		 System.out.println("enter the number of times interest compounded per year:");
		 numberTimeCompoundPerYear=sc.nextInt();
		 
		 System.out.println("duration of investment:");
		 investmentDuration=sc.nextInt();
		 
		 
		 
		 
	 }
	 
	 public double futureValueCalculate() {
			
		        double ratePerPeriod = annualInterestRate / numberTimeCompoundPerYear / 100;
		        int totalPeriod = numberTimeCompoundPerYear * investmentDuration;

		        return principal * Math.pow((1 + ratePerPeriod), totalPeriod);		
		 
	 }
	 public double totalInterestCalculate(double futureValue) {
		return futureValue - principal;
	 }
	 public void  printRecord() {
		 double futureValue=futureValueCalculate();
		 double totalInterest=  totalInterestCalculate(futureValue);
		 System.out.printf("future value is :%.2f%n",futureValue);
		 System.out.printf("total interest calculate is :%.2f%n",totalInterest);
	 }
}
public class CompoundInterestCalculator {

	public static void main(String[] args) {
		CompoundInterest ci=new CompoundInterest();
		ci.acceptRecord();
		ci.printRecord();

	}

}
