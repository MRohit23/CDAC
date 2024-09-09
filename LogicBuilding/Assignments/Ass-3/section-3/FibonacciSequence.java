//5. Write a program to print the Fibonacci sequence up to the number 21///. 

class FibonacciSequence{
	 public static void main(String args[])
	 {
		 int prev=0;
		 int curr=1;
		 System.out.print(prev+" " + curr +" ");
		 int nxt=0;
		 while (nxt<21){
			 nxt=prev+curr;
			 System.out.print(nxt + " ");
			 prev=curr;
			 curr=nxt;
		 }
	 }
}