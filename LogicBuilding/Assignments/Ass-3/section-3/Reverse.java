//4. Write a program to reverse the digits of the number 1234. The output should be 4321.
 import java.util.*;
class Reverse{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
      int rem ,rev=0;
	 int n = sc.nextInt();
	 while (n>0)
	 {
		 //int rem,rev=0;
		 rem=n%10;
		 rev=(rev*10)+rem;
		 n=n/10;
		 
	 }
	 System.out.println("reverse is ::"+ rev);
	}
}