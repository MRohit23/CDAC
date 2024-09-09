 class Main9 { 
 public static void main(String[] args) { 
 int a = 10; 
 System.out.println(a); 
 } 
} 

//10


/*
What error occurs? 


Snippet9.java:1: error: class Main9 is public, should be declared in a file named Main9.java
public class Main9 {
       ^
1 error

Snippet9.java:3: error: not a statement
 int class = 10;
 ^
Snippet9.java:3: error: ';' expected
 int class = 10;
    ^
Snippet9.java:3: error: <identifier> expected
 int class = 10;
          ^
Snippet9.java:4: error: illegal start of expression
 System.out.println(class);
                    ^
Snippet9.java:4: error: <identifier> expected
 System.out.println(class);
                         ^
5 errors




Why can't reserved keywords be used as identifiers

becaused its a reserved word by java .


*/