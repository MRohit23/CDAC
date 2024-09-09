/*

26. Write a program to print the following pattern: 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

*/

class Pattern26{
	public static void main(String args[])
	{
		
int rows=5;
        for (int i = 1; i <= rows; i++) {
			for (int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			
				
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
}
}
}



