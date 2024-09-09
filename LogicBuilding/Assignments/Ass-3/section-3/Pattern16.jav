/*

16. Write a program to print the following pattern: 
 * 
 *** 
 ***** 
 ******* 
*********


 */
 
 
 
 public class Pattern16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}