//9. Write a program to find and print the largest digit in the number 4825.

import java.util.*;
class LargestDigit{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
/*
    int a, b, c;
     int n = sc.nextInt();

    a = n / 10;
    b = (n / 10) % 10;
    c = n % 10;

    if (a > b) {
      if (a > c) {
        System.out.println(a);
      } else {
        System.out.println(c);
      }
    }
	
	*/
	
	
	
	 int a, b, c;
    System.out.println(" enter 3 digit number.");
     int n = sc.nextInt();

    a = n / 100;
    b = (n / 10) % 10;
    c = n % 10;

    if (a > b) {
      if (a > c) {
        System.out.println(a);
      } else {
        System.out.println(c);
      }
    } else {
      if (b > c) {
        System.out.println(b);
      } else {
        System.out.println(c);
      }
    }

  }
	
	}
	
