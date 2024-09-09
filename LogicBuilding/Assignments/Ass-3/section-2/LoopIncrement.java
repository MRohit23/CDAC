public class LoopIncrement { 
 public static void main(String[] args) { 
 int count = 0; 
 for (int i = 0; i < 4; i++) { 
 count += i++ - ++i; 
 } 
 System.out.println(count); 
 } 
} 

/*

c=0 i=0 0<4 t c=c(0)+0-2=0+0-2=-2 i++
c=-2 i=1 1<4  c=(-2)+1-3=-2+1-3=-4 


*/
// Guess the output of this code snippet. -4