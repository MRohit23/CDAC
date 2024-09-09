//3. Write a program to print all multiples of 7 between 1 and 100

import java.util.*;

 class Multiple{
public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for (int i=0;i<100;i++){
	   if(i%7==0){   
	 System.out.println(i);
	 }
	}
}
 }