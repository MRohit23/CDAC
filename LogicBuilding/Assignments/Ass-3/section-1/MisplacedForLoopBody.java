public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) {
 System.out.println(i); 
 System.out.println("Done"); 
 }
 } 
}

/*

0
Done
1
Done
2
Done
3
Done
4
Done

*/




/*
 
// Error to investigate: Why does "Done" print only once, outside the loop? 

--->we dont give the curly braces for for loop so Done is printed 
on console scrren by only once  java MisplacedForLoopBody
0
1
2
3
4
Done

How should the loop body be enclosed to include all statements within the loop?

--> inside the curly braces of for loop

*/