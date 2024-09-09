/*

Question 3: Calculator 


Write a program that acts as a simple calculator. 
It should accept two numbers and an operator 
(+, -, *, /) as input.
 Use a switch statement to perform the appropriate operation. 
 Use nested if-else to check 
 if division by zero is attempted and display an error message.
 
*/



class Calculator
{
	
	public static void main (String args[]){
		
		int a=0, b=10, result, choice=4;
	
	
			switch(choice)
			{
				
				case 1:
				    System.out.println("Addition");
					result=a+b;
					System.out.println("result"+result);
					break;
				
				case 2:
					System.out.println("Substraction");
					result=a-b;
					System.out.println("result"+result);
					break;
					
				case 3:
					System.out.println("Multiplication");
					result=a*b;
					System.out.println("result is :"+result);
					break;
					
				case 4:
					//System.out.println("division");
					//result=a/b;
					if(b==0 ){
						System.out.println("  error divisible by zero");
					}else{
						System.out.println("division");
					result=a/b;
					System.out.println("result"+result);
					}
					
					/*
					division
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Calculator.main(Calculator.java:48)
		
		            */
					
					break;
					
				
				default:
					System.out.println("ohhhh.... out of number print only 1-4 ");
					break;
			}
	     }
	}
