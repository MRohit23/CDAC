 class Main13 { 
 public static void main(String[] args) { 
 String str = "cdac"; 
 System.out.println(str.length()); 
 } 
} 

//4


/*

 What exception is thrown? 
 
 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at Main13.main(Snippet13.java:4)



 Why does it occur?
 
 in string we have not initialized 
 
 
 */