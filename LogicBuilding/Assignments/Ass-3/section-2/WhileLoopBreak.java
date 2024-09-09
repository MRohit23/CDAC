public class WhileLoopBreak { 
 public static void main(String[] args) { 
 int count = 0; 
 while (count < 5) { 
 System.out.print(count + " "); 
 count++; 
 if (count == 3) break; 
 } 
 System.out.println(count); 
 } 
} 

/*
c=0 0<5 t 0 0++=1 1==3 f 
c=1 1<5 t 1 1++=2  2==3 f
c=2 2<5 t 2 2++=3  3==3  t (exit the loop )
print 0 1 2 3
*/
// Guess the output of this while loop.  0 1 2 3