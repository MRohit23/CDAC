public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i++) { 
 System.out.println(i); 
 } 
 } 
} 


/*
 java InfiniteForLoop
0
1
2
3
4
5
6
7
8
9



*/





/*

 Error to investigate: Why does this loop run infinitely? 
 
 -->beacause in for loop condition  part is always true
 when the condition is false then loop is terminated.


How should the loop control variable be adjusted?

-->any false condition or until true condition in put that loop  
 
*/