package Ass_4_sir;

import java.util.Scanner;

 class CompoundInterestCalculator{
	private double principal;
	private double annualInterestRate;
	private int numberTimeCompoundPerYear;
	private int investmentDuration;
	
	
	 public CompoundInterestCalculator(double principal,double annualInterestRate,int numberTimeCompoundPerYear,int investmentDuration) {
		 this.principal=principal;
		 this.annualInterestRate=annualInterestRate;
		 this.numberTimeCompoundPerYear=numberTimeCompoundPerYear;
		 this.investmentDuration=investmentDuration;
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
	
	
	public int getNumberTimeCompoundPerYear() {
		return numberTimeCompoundPerYear;
	}

	public void setNumberTimeCompoundPerYear(int numberTimeCompoundPerYear) {
		this.numberTimeCompoundPerYear = numberTimeCompoundPerYear;
	}

	public int getInvestmentDuration() {
		return investmentDuration;
	}

	public void setInvestmentDuration(int investmentDuration) {
		this.investmentDuration = investmentDuration;
	}

	public double futureValueCalculate() {
		
        double ratePerPeriod = annualInterestRate / numberTimeCompoundPerYear / 100;
        int totalPeriod = numberTimeCompoundPerYear * investmentDuration;

        return principal * Math.pow((1 + ratePerPeriod), totalPeriod);		
 
}
    public double totalInterestCalculate(double futureValue) {
return futureValue - principal;
}
	
	
	@Override
	public String toString() {
		return "CompoundInterestCalculator [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", numberTimeCompoundPerYear=" + numberTimeCompoundPerYear + ", investmentDuration=" + investmentDuration + "]";
	}
}
	class  CompoundInterestCalculatorUtil {
		Scanner sc=new Scanner(System.in);

		private CompoundInterestCalculator cic;
		
		 public void acceptRecord() {
			

			 System.out.println("enter the principal amount(rs):");
			  double principal=sc.nextDouble();
			 
			 System.out.println("enter the annual interest rate :");
			 double annualInterestRate= sc.nextDouble();
			 
			 System.out.println("enter the number of times interest compounded per year:");
			 int numberTimeCompoundPerYear=sc.nextInt();
			 
			 System.out.println("duration of investment:");
			  int investmentDuration=sc.nextInt();
			
			
			cic=new CompoundInterestCalculator(principal,annualInterestRate,numberTimeCompoundPerYear,investmentDuration);
			
		}
		
		
		 public void  printRecord() {
			 double futureValue=cic.futureValueCalculate();
			 double totalInterest=cic.totalInterestCalculate(futureValue);
			 System.out.printf("future value is :%.2f%n",futureValue);
			 System.out.printf("total interest calculate is :%.2f%n",totalInterest);
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

public class CompoundCalc {

	public static void main(String[] args) {
		CompoundInterestCalculatorUtil com=new CompoundInterestCalculatorUtil();
		com.menuList();
	}

}
