class Switch { 
 public static void main(String[] args) { 
 int  score = 85; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 

//Great job!



/*

 Error to Investigate: Why does this code not compile? 

What does the error tell you about the 
types allowed in switch expressions?


double and float are not allowed in switch

Snippet25.java:4: error: patterns in switch statements are a preview feature and are disabled by default.
 switch(score) {
       ^
  (use --enable-preview to enable patterns in switch statements)
Snippet25.java:5: error: constant label of type int is not compatible with switch selector type double
 case 100:
      ^
Snippet25.java:8: error: constant label of type int is not compatible with switch selector type double
 case 85:
      ^
3 errors

 How can you modify the code to make it work? 
 
 
 
 to change the data type of score variable 
 
 
 */