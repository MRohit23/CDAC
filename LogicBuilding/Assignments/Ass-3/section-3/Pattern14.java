
/*
14. Write a program to print the following pattern: 
* 
 ** 
 *** 
 ***** 
 ******* 
 *********
 
 */
 
 import java.util.*;
 class Pattern14{
	 public static void main(String args[])
	 {
		 int n;
                  System.out.println("Enter a number");                
                  Scanner scanner = new Scanner(System.in);  
                  n = scanner.nextInt(); 
                  
                  for(int i=1;i<=n;i++){
                           if(i%2==0&&i>2){
                                    continue;
                           }
                           for(int j=1;j<=i;j++){
                                 System.out.print("*");
                            }
                            System.out.println();
              }
	 }
 }
