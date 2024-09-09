//Write a program to calculate the sum of the digits of the number 9876. The output should be 
//30 (9 + 8 + 7 + 6). 
 
 import java.util.*;
 class SumOfDigits{
  public static void main(String args[]){
	    
 int n , digit, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
n = sc.nextInt(); 
while(n > 0)  
{  
  
digit = n % 10;  

sum = sum + digit;  
 
n = n / 10;  
}  

System.out.println("Sum of Digits: "+sum);  
}  
}  