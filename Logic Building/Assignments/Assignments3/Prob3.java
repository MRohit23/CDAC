// Write a program to print all multiples of 7 between 1 and 100.

public class Prob3
 {
  public static void main(String[] args) {

     int count = 0;

    for (int i=1 ; i<=100 ; i++) {
      
        if(i%7==0) {
          count++;
        }
      
    }
    System.out.println(count);

    
   }

  
}