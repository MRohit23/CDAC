package Ass_3_sir;
//1. Loan Amortization Calculator
//Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
//1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
//2.	Calculate the monthly payment using the standard mortgage formula:





import java.util.*;
class LoanAmortizationCalculator{
	private float Pamount;
	private float annual_interest_rate; 
	private float loan_term;
	private double amount_paid;
	private double monthlyPayement;
	
	public void acceptRecord()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Pmount:    ");
		this.Pamount= sc.nextFloat(); 
		System.out.print("annual_interest_rate:    ");
		this.annual_interest_rate= sc.nextFloat(); 
		System.out.print("Loan_term:    ");
		this.loan_term= sc.nextFloat(); 
	}
	public void calculateMonthlyPayment()
	{
		float numberOfMonths = this.loan_term*12; 
				
		float monthlyInterestRate=this.annual_interest_rate/12/100;
	
		this.monthlyPayement =  (float)(this.Pamount * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),numberOfMonths))/(Math.pow((1 + monthlyInterestRate),(numberOfMonths))-1));
		
		this.amount_paid = this.monthlyPayement*(this.loan_term * 12);
	}
	 
	public void printRecord()
	{

		System.out.println(this.monthlyPayement);

	}
}
public class LoanCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoanAmortizationCalculator l= new LoanAmortizationCalculator();
		l.acceptRecord();
		l.calculateMonthlyPayment();
		l.printRecord();

	}

}



















