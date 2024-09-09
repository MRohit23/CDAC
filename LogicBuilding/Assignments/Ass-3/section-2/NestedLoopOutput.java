public class NestedLoopOutput { 
 public static void main(String[] args) { 
 for (int i = 1; i <= 3; i++)
	 { 
       for (int j = 1; j <= 2; j++) { 
         System.out.print(i + " " + j + " "); 
		 } 
     System.out.println(); 
     } 
 } 
} 

/*
Dry Run : arrange the code systematically 
i->1<=3 t
   j->1 <=2  t
     1 1 
	 j++(2)
    j->2<=2  t
	  1 1 1 2
	  j++(3)
	 j->3<=2 f
	 i++(2)
i->2<=3 t
   j->1 <=2 t 
      2 1 
	  j++(2)
	 j->2<=2 t 
	   2 1 2 2
	   j++(3)
	 j->3<=2 f
	 i++(3)
i->3<=3 t
   j->1 <=2 t 
      3 1 
	  j++(2)
	 j->2<=2 t 
	   3 1 3 2
	   j++(3)
	 j->3<=2 f
	    i++(4)
i->4<=3 f 
     "loop terminate"
	  
	 
    	 



*/



/*
 Guess the output of this nested loop.
1 1 1 2
2 1 2 2
3 1 3 2
*/