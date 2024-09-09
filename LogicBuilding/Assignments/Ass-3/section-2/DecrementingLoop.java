public class DecrementingLoop { 
 public static void main(String[] args) { 
 int total = 0; 
 for (int i = 5; i > 0; i--) { 
 total += i; //total=total+i;
 if (i == 3) continue; 
 total -= 1; 
 } 
 System.out.println(total); 
 } 
} 
/*
Dry Run : arrange the code systematically 

t=0 i=5 5>0 t=0+5=5 5==3 f t=5-1=4
t=4 i=4 4>0 t=4+4=8 4==3 f t=8-1=7
t=7 i=3 3>0 t=7+3=10 3==3 t t=10-1=9
t=9 i=2 2>0 t=9+2=11  2==3 f  t=11-1=10
t=10  i=1 1>0 t=10+1=11   9==3 f  t =11-1=10
t=10 i=0 0>0 f 





// Guess the output of this loop.  11
*/