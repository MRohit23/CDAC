
import java.util.*;


class NestedSwitchCalculator {
 public static void main(String urmi[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a operator which you want to calculate (eg: +,-,*,/,%)");
	
	char c = sc.next().charAt(0);

	switch(c){

	case '+':
		System.out.println("pls enter how many numbers u want to add");
		int i = sc.nextInt();
		    switch(i){
				case 1: 
					System.out.println("one number cannot be added");
					break;
				case 2:
				System.out.println("Enetr numbers:");
					int a1 = sc.nextInt();
					int a2 = sc.nextInt();
					int result = a1 + a2;
					System.out.println("Result "+result);
					break;
				default:
					System.out.println("we can add only 2 numbers");
					break;
			}

		break;
	case '-' : 
	      System.out.println("pls enter how many numbers u want to Substract");
		int m = sc.nextInt();
		      switch(m){
				case 1: 
					System.out.println("one number cannot be Substract");
					break;
				case 2:
				System.out.println("Enetr numbers:");
					int a3 = sc.nextInt();
					int a4 = sc.nextInt();
					int result = a3 - a4;
					System.out.println("Result "+result);
					break;
				default:
					System.out.println("we can substract only 2 numbers");
					break;
			}
		break;
	case '*':
	    System.out.println("pls enter how many numbers u want to multiply");
		int j =sc.nextInt ();
		  switch(j){
			  case 1:
			    System.out.println("one number cannot be multiply");
				break;
			  case 2:
			  System.out.println("Enetr numbers:");
			   int a5= sc. nextInt();
			   int a6=sc.nextInt();
			   int result=a5*a6;
			   System.out.println("Result is: "+result);
			   break;
			  default :
			  System .out.println("we can multiply only two numbers");
			  break;
		  }
		  break;
	case '/':
	       System.out.println("pls enter how many numbers u want to Divide");
		int k =sc.nextInt ();
		  switch(k){
			  case 1:
			    System.out.println("one number cannot be divide");
				break;
			  case 2:
			  System.out.println("Enetr numbers:");
			   int a7= sc. nextInt();
			   int a8=sc.nextInt();
			   int result=a7/a8;
			   System.out.println("Result is: "+result);
			   break;
			  default :
			  System .out.println("we can Divide only two numbers");
			  break;
		  }
		  break;
	case '%':
	      System.out.println("pls enter how many numbers u want to get the remainder");
		int l=sc.nextInt ();
		  switch(l){
			  case 1:
			    System.out.println("one number cannot be used in modulas/get remainder");
				break;
			  case 2:
			  System.out.println("Enetr numbers:");
			   int a9= sc. nextInt();
			   int a10=sc.nextInt();
			   int result=a9*a10;
			   System.out.println("Result is: "+result);
			   break;
			  default :
			  System .out.println("we can get the remainder only two numbers");
			  break;
		  }
		  break;
	
	
	
	
	default : 
		System.out.println("Invalid input");
		break;

	}
	
	
 }
}


