public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count=0; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
} 

/*
java UninitializedWhileLoop
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


// Error to investigate: Why does this code produce a compilation error? 

--->whenever write a condition in while loop aur any loops first the initialize the variable


UninitializedWhileLoop.java:4: error: variable count might not have been initialized
 while (count < 10) {
        ^
1 error


What needs to be done to initialize the loop variable properly?

--> once  get the initialization done then the compiler knows to the value of that variable 

*/