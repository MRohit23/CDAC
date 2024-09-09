public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count != 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 


/*
 java IncorrectWhileCondition
5
4
3
2
1
*/

/*

// Error to investigate: Why does the loop not execute as expected?

IncorrectWhileCondition.java:4: error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
              ^
1 error




 What is the issue with the condition in the `while` loop? 
 
 --->the while conditionis getting false 
 
 */