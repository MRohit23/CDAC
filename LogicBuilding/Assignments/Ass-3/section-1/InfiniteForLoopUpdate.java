public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i--) { 
 System.out.println(i); 
 } 
 } 
} 

/*

// Error to investigate: Why does the loop print unexpected results or run infinitely?

--->sometimes the conditions going wrong way or 
a always true the conditions going to infinite loop 

 How should the loop update expression be corrected?
 
 ---> just change here the increment to decrement
 --> corrected as a syntactically correct or check the conditions

*/ 