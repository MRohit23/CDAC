// Working with java.lang.Integer
class prob4 {

    public static void main(String[] args) {

//  Write a program to test how many bytes are used to represent an int value using the BYTES field. (Hint: Use Integer.BYTES).
System.out.println(Integer.BYTES);        
// Write a program to find the minimum and maximum values of int using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
// Declare a method-local variable number of type int with some value and convert it to a String using the toString method. (Hint: Use Integer.toString(int)).
int number = 143;
System.out.println(Integer.toString(number));
// Declare a method-local variable strNumber of type String with some value and convert it to an int value using the parseInt method. (Hint: Use Integer.parseInt(String)).
String str2 = "153";
System.out.println(Integer.parseInt(str2));        
// Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to an int value. (Hint: parseInt method will throw a NumberFormatException).
//String str3 = "ab12ab3";
//int number3 = Integer.parseInt(str3);
//System.out.println(str3);
//Declare a method-local variable number of type int with some value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(int)).
int number4 = 123;
System.out.println(Integer.valueOf(number4));
// Declare a method-local variable strNumber of type String with some integer value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(String)).
String strNumber = "569";
System.out.println(Integer.valueOf(strNumber));
// Declare two integer variables with values 10 and 20, and add them using a method from the Integer class. (Hint: Use Integer.sum(int, int)).
int number6 = 10;
int number7 = 20;
System.out.println(Integer.sum(number6, number7));
// Declare two integer variables with values 10 and 20, and find the minimum and maximum values using the Integer class. (Hint: Use Integer.min(int, int) and Integer.max(int, int)).
System.out.println(Integer.min(number6,number7));
System.out.println(Integer.max(number6,number7));
// Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).
int number8 = 3;
System.out.println(Integer.toBinaryString(number8));
System.out.println(Integer.toHexString(number8));
System.out.println(Integer.toOctalString(number8));

        

       










    }






}