 class Main6 { 
 public static void main(String[] args) {
int y=10;	 
 int x = y + 10; 
 System.out.println(x); 
 } 
} 

//20

/*

javac Snippet6.java
Snippet6.java:1: error: class Main6 is public, should be declared in a file named Main6.java
public class Main6 {
       ^
1 error


 What error occurs? 
 
 
 Snippet6.java:3: error: cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main6
1 error
 
 Why must variables be declared?
 
 */