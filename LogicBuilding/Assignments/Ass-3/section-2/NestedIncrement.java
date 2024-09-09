public class NestedIncrement { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = ++a * b-- - --a + b++; 
 System.out.println(result); 
 } 
} 

/*
 
 a=10  ++a=11  --a=10
 b=5   b--=5(4)   b++= 4

 11*5-10+4=55-10=45+4=49
 */
// Guess the output of this code snippet.  49