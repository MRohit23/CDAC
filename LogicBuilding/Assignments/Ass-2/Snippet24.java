class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 break;
 case 2: 
 System.out.println("Level 2"); 
 break;
 case 3: 
 System.out.println("Level 3"); 
  break;
 default: 
 System.out.println("Unknown level"); 
  break;
 } 
 } 
} 



//Level 1



//>java MissingBreakCase
//Level 1
//Level 2
//Level 3
//Unknown level


/*
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? 
 
 
 
--> because we dont write break statement after case complete

What is the role of the break statement in this situation? 

-->when answer is got exit the case 


*/