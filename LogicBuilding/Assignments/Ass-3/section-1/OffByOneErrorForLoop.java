public class OffByOneErrorForLoop { 
 public static void main(String[] args) { 
 for (int i = 1; i < 10; i++) { 
 System.out.println(i); 
 } 
 
 
 
 
 // Expected: 10 iterations with numbers 1 to 10 
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
 } 
}


/*


java OffByOneErrorForLoop
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
// Error to investigate: What is the issue with the loop boundaries? 

--> here i is initialize to 1 but until condition is <= less than is equal to so the last number 10 is also print on the console screeen


 How should the loop be adjusted to meet the expected output? 
 
 --> jus delete the = equal to sign in condition part 
 
 
 */