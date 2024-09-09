package Ass_4_sir;

import java.util.Scanner;

class Bmi{
	private double weight;
	private double height;
	private double bmi;
	
	public Bmi(double weight,double height) {
		 this.weight=weight;
		 this.height=height;
		 
	 }

	
	
	public double getWeight() {
		return weight;
	}

	public void setHeight(double height) {
		this.height = height;
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
	
	




@Override
public String toString() {
	return "Bmi [weight=" + weight + ", height=" + height +  "]";
}
}
class  BmiUtil {
	Scanner sc=new Scanner(System.in);

	private Bmi bm;
	
	 public void acceptRecord() {
		
		 System.out.println("Enter weight in kg");
		 double weight = sc.nextDouble();
			System.out.println("Enter height in m ");
			double height = sc.nextDouble();
		
		
		bm=new Bmi(weight,height);
		
	}
	

public void  printRecord() {
	bm.calculateBmi();
	bm.classifyBmi();
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

public class BmiTrack {
	public static void main(String[] args) {
		BmiUtil bmu=new BmiUtil();
		bmu.menuList();

	}

}
