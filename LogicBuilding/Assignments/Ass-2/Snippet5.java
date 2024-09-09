 class Main5 { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(String[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 

//java Main5
//Main method with String[] args


/*

javac Snippet5.java
Snippet5.java:1: error: class Main5 is public, should be declared in a file named Main5.java
public class Main5 {
       ^
1 error

Can you have multiple main methods?  no 

javac Snippet5.java
Snippet5.java:5: error: method main(String[]) is already defined in class Main5
 public static void main(String[] args) {
                    ^
1 error


What do you observe?

*/