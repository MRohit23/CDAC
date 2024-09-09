public class DoWhileLoop { 
 public static void main(String[] args) { 
 int i = 1; 
 do { 
 System.out.print(i + " "); 
 i++; 
 } while (i < 5); 
 System.out.println(i); 
 } 
} 
/*
i=1 1 1++=2 2<5 
    2 2++=3 3<5
	3 3++=4 4<5
	4 4++=5 5<5
	1 2 3 4 5
*/


// Guess the output of this do-while loop. 1 2 3 4 5
