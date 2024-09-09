 class Main11 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
} 

//3

/*

What runtime exception do you encounter?

java Main11
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main11.main(Snippet11.java:4)

 Why does it occur?

array elements is only 3 are initialized and print the 5 are printed so this is the range is out of bound  

*/