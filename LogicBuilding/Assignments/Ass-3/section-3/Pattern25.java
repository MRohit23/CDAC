/*


25. Write a program to print the following pattern: 
1 
12 
123 
1234 
12345 



*/



public class Pattern25
 
{  
public static void main(String args[])   
{   
int i, j, n=7;   
 
for(i=0; i<n; i++)  
{      
  
for(j=1; j<=i; j++)  
{   
  System.out.print(j+ " ");  
  
}   
  
System.out.println();   
}   
}   
}  