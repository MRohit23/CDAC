 class Main10 { 
 public  void display() { 
 System.out.println("No parameters"); 
 } 
 public  void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 Main10 m= new Main10();
 m.display(); 
 m.display(5); 
 } 
} 


//No parameters
//With parameter: 5


/*
What happens when you compile and run this code? 

Snippet10.java:1: error: class Main10 is public, should be declared in a file named Main10.java
public class Main10 {
       ^
Snippet10.java:9: error: non-static method display() cannot be referenced from a static context
 display();
 ^
Snippet10.java:10: error: non-static method display(int) cannot be referenced from a static context
 display(5);
 ^
3 errors


Is method overloading allowed?

*/