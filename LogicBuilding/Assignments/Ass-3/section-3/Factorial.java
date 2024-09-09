//2. Write a program to compute the factorial of the number 10

import java.util.*;

public class Factorial{
public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int fact=1;
	
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of number is "+fact );
	}
}

/*
4
Factorial of number is 24
*/