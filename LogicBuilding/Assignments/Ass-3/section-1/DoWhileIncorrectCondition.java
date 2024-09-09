public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num < 10); 
 } 
} 



//infinite loop then 


/*

 java DoWhileIncorrectCondition
0
1
2
3
4
5
6
7
8
9

*/



/*
Error to investigate: Why does the loop only execute once? 

---->while condition is always true num>0


What is wrong with the loop condition in the `d0-while` loop?

---> while condition is always true because
 the num is always greter than 0 in inside the loop num is increment 

*/