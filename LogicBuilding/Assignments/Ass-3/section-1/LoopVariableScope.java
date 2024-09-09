public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 System.out.println(x);
 } 
 //System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 



/*
java LoopVariableScope
0
2
4
6
8
*/
/*

Error to investigate: Why does the variable 'x' cause a compilation error? 


LoopVariableScope.java:6: error: cannot find symbol
 System.out.println(x); // Error: 'x' is not accessible here
                    ^
  symbol:   variable x
  location: class LoopVariableScope
1 error


How does scope


-->inside the loop write the output statement 
*/