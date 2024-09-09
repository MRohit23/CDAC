 class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 break;
 case 3: 
 System.out.println("Value is 3"); 
  break;
 default: 
 System.out.println("Default case");
 break; 
 } 
 } 
} 


//Value is 2

/*
Snippet23.java:1: error: class Confusion is public, should be declared in a file named Confusion.java
public class Confusion {
       ^
1 error


Error to Investigate: Why does the default case print after "Value is 2"? 

Value is 2
Value is 3
Default case


 because  break is not writing after the case completion 


How can you prevent 
the program from executing the default case?

write the break statement


*/