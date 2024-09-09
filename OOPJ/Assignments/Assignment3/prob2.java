/*
 * 2. Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
o	Future Value Calculation:
	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
o	Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, printRecord and test the functionality in main method.

 */

import java.util.Scanner;

public class prob2 {
    
    public static void main(String[] args) {

        CompoundInterestCalculator ans = new CompoundInterestCalculator();
        ans.acceptRecord();
        System.out.println(ans.calculateFutureValue());
      
    CompoundInterestCalculator.sc.close();    
    }

}

// Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, printRecord and test the functionality in main method.

class CompoundInterestCalculator {
    static Scanner sc = new Scanner(System.in);
double principal;
double interestRate;
int numberOfCompounds;
int years;

public void acceptRecord() {

    
     
    principal = sc.nextDouble();
    interestRate = sc.nextDouble();
    numberOfCompounds = sc.nextInt();
    years = sc.nextInt();

}

public double calculateFutureValue() {
   
    double futureValue = principal * (Math.pow(1 + interestRate / numberOfCompounds,(numberOfCompounds * years)));
    double totalInterest = futureValue - principal;
    return totalInterest;


}
}
