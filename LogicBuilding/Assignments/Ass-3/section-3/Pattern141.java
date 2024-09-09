import java.util.Scanner;
public class Demo1{
       public static void main(String args[]){

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

/*

public class Pattern25 { public static void main(String[] args) { for (int i = 1; i <= 5; i++) { for (int j = 1; j <= i; j++) { System.out.print(j); } System.out.println(); } } }
*/

/*
class Main  correct 14 
{
	public static void main(String args[])
	{  
		for(int i=1; i<=10; i++)
		{
			if(i==5 || i==7 || i==9)
				 { 
					 continue;  
				 }
			 for(int j=1;j<i;j++)
			 {  
				System.out.print("*");
				 
			 }
			 System.out.println();
		}
	}
}
*/

/*
For printing starpattern using nested whileloop

class pattern{

	public static void main(String[] args){
		int row = 5,i =1,j=1;
		
		while(i<=row){
			
			while(j<=i){
				System.out.print("*");
				j++;	
			}	
			System.out.println();
			i++;
			j = 1 ;
		}
	}
}

*/
/*

 class Pattern
 {
    public static void main(String[] args)  
    {
       
        
       
        for(int i=0;i<8;i++)
         {
			 for(int j=1;j<=i;j++)
         {
			 
			 System.out.print("*");
          
         }
			System.out.println("*"); 
          
         }
	 	  
    }
  }
*/

/*
mport java.util.Scanner;
public class Demo1{
       public static void main(String args[]){

                 int n;
                  System.out.println("Enter a number");                
                  Scanner scanner = new Scanner(System.in);  
                  n = scanner.nextInt(); 
                  
                  for(int i=1;i<=n;i++){
                           if(i%2==0){
                                    continue;
                           }
                           for(int j=1;j<=i;j++){
                                 System.out.print("*");
                            }
                            System.out.println();
              }

     }
}
*/
public class Pattern14 
 {
public static void main(String[] args) {
        int n = 6; 

        for (int a = 1; a <= n; a++) {
            
            for (int b= 1; b <= a - 1; b++) {
                System.out.print(" ");
            }

            
            for (int c = 1; c <= (2 * a - 1); c++) {
                System.out.print("*");
            }

            
            System.out.println();
        }
    }
}