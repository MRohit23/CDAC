public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i--) { 
 System.out.println(i); 
 } 
 } 
} 


/*


10
9
8
7
6
5
4
3
2
1
0



*/




/*

infinite loop 


// Error to investigate: Why does this loop not print numbers in the expected order? 

-->The problem is that the loop starts from 10 and decrements down to 0,
 but it doesn't stop there. 
It will continue to run with negative values 


What is the problem with the initialization and update statements in the `for` loop? 

-->initialization is still same but just change on increment to as a decrement and then run the program is reverse order


*/