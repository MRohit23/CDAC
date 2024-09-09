package Ass_4_sir;

import java.util.Scanner;

class LoanAmortizationCalculator{
	 private double principal;
	 private double annualInterestRate;
	 private int loanTerm;
	 
	 //constructor of LoanAmortizationCalculator
	 public LoanAmortizationCalculator(double principal,double annualInterestRate,int loanTerm) {
		 this.principal=principal;
		 this.annualInterestRate=annualInterestRate;
		 this.loanTerm=loanTerm;
	 }

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	//calculate monthly payment
	public double calculateMonthlyPayment() {
		double monthlyInterestRate = (annualInterestRate / 100)/ 12 ;
		int numberOfMonths = loanTerm * 12;
		double monthlyPayment=(principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) 
                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
		return monthlyPayment;
	}
	
	//calculate total ammount paid
	public double calculateTotalAmount() {
		double monthlyPayment=calculateMonthlyPayment();
		double totalAmount= monthlyPayment*loanTerm*12;
		return totalAmount;
	}

	// toString method call directly from source
	@Override
	public String toString() {
		return "LoanAmortizationCalculator [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", loanTerm=" + loanTerm + "]";
	}
	 
	
	 
	
}
// class LoanAmortizationCalculatorUtil
class  LoanAmortizationCalculatorUtil {
	Scanner sc=new Scanner(System.in);
	//variable LoanAmortizationCalculator
	private LoanAmortizationCalculator loan1;
	
	void acceptRecord() {
		
		System.out.print("Principal Ammount:₹");
		double principal=sc.nextDouble();
		System.out.print("Annual interest rate:");
		double annualInterestRate=sc.nextDouble();
		System.out.print("Loan Term:");
		int loanTerm=sc.nextInt();
		
		//instance of LoanAmortizationCalculator
		loan1=new LoanAmortizationCalculator(principal,annualInterestRate,loanTerm);
		
	}
	
	void printRecord() {
		//System.out.println(loanAmortizationCalculator);
		double monthlyPayment=loan1.calculateMonthlyPayment();
		double totalAmount=loan1.calculateTotalAmount();
		System.out.println("Monthly Payment:₹"+monthlyPayment);
		System.out.println("Total amount:₹"+totalAmount);
		
	}
	public void menuList() {
		while(true) {
			System.out.println("1.Accept Record");
			System.out.println("2.Print Record");
			System.out.println("3.Exit");
			System.out.print("Enter option:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				acceptRecord();
				break;
			case 2:
				printRecord();
				break;
			case 3:
				System.out.println("Program Terminated");
				return;
				default:
					System.out.println("Invalid Option");
			}
		}
		
	}
}
public class LoanCalc {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		LoanAmortizationCalculatorUtil loan=new LoanAmortizationCalculatorUtil();
		loan.menuList();
	}

}



/*

1. Loan Amortization Calculator 
Implement a system to calculate and display the monthly payments for a mortgage loan. The 
system should: 
1. Accept the principal amount (loan amount), annual interest rate, and loan term (in 
years) from the user. 
2. Calculate the monthly payment using the standard mortgage formula: 
o 
Monthly Payment Calculation: 
 monthlyPayment = principal * (monthlyInterestRate * (1 + 
monthlyInterestRate)^(numberOfMonths)) / ((1 + 
monthlyInterestRate)^(numberOfMonths) - 1)
  
 
Where 
and 
monthlyInterestRate = annualInterestRate / 12 / 100
 numberOfMonths = loanTerm * 12
 Note: Here ^ means power and to find it you can use Math.pow( ) 
method 
3. Display the monthly payment and the total amount paid over the life of the loan, in 
Indian Rupees (₹). 
Define the class 
LoanAmortizationCalculator
 getter and setter methods, a 
toString
 LoanAmortizationCalculatorUtil
 with fields, an appropriate constructor, 
method and business logic methods. Define the class 
with methods 
menuList
 . Define the class 
Program
 with a 
main
 acceptRecord
 , 
printRecord
 , and 
method and test the functionality of the 
utility class.
*/


































