 class Switch26 { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case '5': 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 


//Number is 5



/*
 Error to Investigate: Why does the compiler complain about duplicate case labels?

Snippet26.java:8: error: duplicate case label
 case 5:
 ^
1 error


--->case duplication are not allowed



 What happens when you have two identical case labels in the same switch block? 
  
  
---->one case is make a char type or change the name 
 
 */