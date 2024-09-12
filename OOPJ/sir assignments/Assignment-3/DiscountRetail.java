package Ass_3_sir;

import java.util.Scanner;

/*4. Discount Calculation for Retail Sales 
Design a system to calculate the final price of an item after applying a discount. The system 
should: 
1. Accept the original price of an item and the discount percentage from the user. 
2. Calculate the discount amount and the final price using the following formulas: 
Discount Amount Calculation: 
(discountRate / 100)
 Final Price Calculation: 
discountAmount = originalPrice * 
finalPrice = originalPrice - 
discountAmount
 3. Display the discount amount and the final price of the item, in Indian Rupees (₹). 
Define class DiscountCalculator with methods acceptRecord, calculateDiscount 
& printRecord and test the functionality in main method. */

class DiscountCalculator {
	private double originalPriceItem;
	private double discountRate;
	private double discountAmount;
	private double finalPrice;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original price of a item :");
		this.originalPriceItem = sc.nextDouble();
		System.out.println("enter the discount rate in percentage ");
		this.discountRate = sc.nextDouble();

	}

	public void calculateDiscount() {
		discountAmount = originalPriceItem * (discountRate / 100);
		finalPrice = originalPriceItem - discountAmount;
	}

	public void printRecord() {
		System.out.println("Discount amount is a :" + discountAmount);
		System.out.println("Final price is :" + finalPrice);

	}

}

public class DiscountRetail {

	public static void main(String[] args) {
		
		DiscountCalculator dc= new DiscountCalculator();
		dc.acceptRecord();
		dc.calculateDiscount();
		dc.printRecord();

	}

}
