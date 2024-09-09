public class IncrementDecrement { 
 public static void main(String[] args) { 
 int x = 5; 
 int y = ++x - x-- + --x + x++; 
 System.out.println(y); 
 } 
} 

// 8
/*
x=5  y= ++5(6)-6--(5) + --5(4) + 4++(5) //6-6+4+4=0+4=4+4=8


*/
// Guess the output of this code snippet.