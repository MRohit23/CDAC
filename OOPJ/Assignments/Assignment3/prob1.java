/*
 * . Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.

 */
import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        LoanAmortizationCalculator ans = new LoanAmortizationCalculator();
        
        ans.acceptRecord();
        double monthlyPayment = ans.calculateMonthlyPayment();
        ans.printRecord(monthlyPayment);
    }
}

class LoanAmortizationCalculator {
    private double principalAmount;
    private double interestRate;
    private int loanTerm;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ₹");
        principalAmount = sc.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        interestRate = sc.nextDouble();
        System.out.print("Enter the loan term (in years): ");
        loanTerm = sc.nextInt();
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = interestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        double monthlyPayment = principalAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
                                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        return monthlyPayment;
    }

    public void printRecord(double monthlyPayment) {
        int numberOfMonths = loanTerm * 12;
        double totalPayment = monthlyPayment * numberOfMonths;
        
        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Amount Paid Over the Life of the Loan: ₹%.2f\n", totalPayment);
    }
}
