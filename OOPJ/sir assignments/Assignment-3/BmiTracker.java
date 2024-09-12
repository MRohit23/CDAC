package Ass_3_sir;

/*
// BMI (Body Mass Index) Tracker  
//Create a system to calculate and classify Body Mass Index (BMI). The system should: 
//1. Accept weight (in kilograms) and height (in meters) from the user. 
//2. Calculate the BMI using the formula:  
//BMI Calculation: 
//BMI = weight / (height * height)
//3. Classify the BMI into one of the following categories: 
//Underweight: BMI < 18.5 
//Normal weight: 18.5 ≤ BMI < 24.9 
//Overweight: 25 ≤ BMI < 29.9 
//Obese: BMI ≥ 30 
//4. Display the BMI value and its classification. 
//Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI & 
//printRecord and test the functionality in main method.?
*/
import java.util.Scanner;

class BmiTrack {
	private double weight;
	private double height ;
	private double bmi;
	

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in kg");
		this.weight = sc.nextDouble();
		System.out.println("Enter height in m ");
		this.height = sc.nextDouble();
	}
	public void  calculateBmi() {
		
		  bmi=weight / (height * height);
		  System.out.println("bmi is "+bmi);
	}

	public void  classifyBmi() {
		if(bmi<18.5) {
			System.out.println("u r in underweight satge:");
		}else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("u r in normal stage :");
		}
		else if (bmi >= 25 && bmi <= 29.9){
			System.out.println("u r in overweight stage :");
		}else if(bmi>29.9) {
			System.out.println("u r in obese stage ");
		}else
		{
			System.out.println("something went wrong:");
		}
	}

	public void printRecord() {
		calculateBmi();
		classifyBmi();
	}
}

public class BmiTracker {
	public static void main(String[] args) {
		BmiTrack bt = new BmiTrack();
		bt.acceptRecord();
		bt.printRecord();
	}

}



