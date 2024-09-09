public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 5; 
 do { 
  System.out.println(num);
 num--; 
 } while (num >0); 
 } 
} 

//1

/*
 java OffByOneDoWhileLoop
5
4
3
2
1

*/


/*

// Error to investigate: Why does this loop print unexpected numbers?

---> here the initialization is not a proper way 


 What adjustments are needed to print the numbers from 1 to 5? 
 ---> only the change in only initialize the value to 5
 
 
 
 */