// Write a program to find and print the first 5 prime numbers.

public class Prob6 {
  public static void main(String[] args) {

    
    
  for (int i=2 ; i<=50 ; i++) {
    int count = 0;
    for(int j=2 ; j<=i ;j++) {

      if(i%j!=0) {
        
      }
      else {
        count++;
        
      }
      
    }
    if(count==1) {
      System.out.println(i+" is prime number");
    }
    

    
  }

     
   }

  
}