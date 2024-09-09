

/*

18. Write a program to print the following pattern: 
 * 
 *** 
 ***** 
 ******* 
 ***** 
 *** 
 * 


*/





public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;

        for (int i = 1; i <= n ; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= m  ; k++) {
                System.out.print("*");
            }
            m+=2;
            System.out.println();

        }

        int nm = n*2-3;
        for (int i = n; i >= 1 ; i--) {

            for (int j = i; j <= n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nm ; k++) {
                System.out.print('*');
            }
            nm-=2;
            System.out.println();
        }
    }
}
