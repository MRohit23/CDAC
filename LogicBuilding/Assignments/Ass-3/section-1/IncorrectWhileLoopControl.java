public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num==10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 

/*
// Error to investigate: Why does the loop execute indefinitely?

--->while condition is not use assignment operator to assign a value as a variable 


 What is wrong with the loop condition? 
 
 --> in the while condition true condition  for given initialization or incre/decre



IncorrectWhileLoopControl.java:4: error: incompatible types: int cannot be converted to boolean
 while (num = 10) {
            ^
1 error



*/