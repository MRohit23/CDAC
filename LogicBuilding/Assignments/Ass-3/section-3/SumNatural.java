//1. Write a program to calculate the sum of the first 50 natural numbers. 


import java.util.*;

public class SumNatural{
public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for (int i =0;i<=n;i++){
		sum=sum+i;
	
	}
	System.out.println(sum);
}
}	
//java SumNatural
//100
//5050
