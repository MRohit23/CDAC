//Working with java.lang.Long
 
 class prob5 {
public static void main(String[] args) {

// Write a program to test how many bytes are used to represent a long value using the BYTES field. (Hint: Use Long.BYTES).
System.out.println(Long.BYTES);
// Write a program to find the minimum and maximum values of long using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).
System.out.println(Long.MIN_VALUE);
System.out.println(Long.MAX_VALUE);
// Declare a method-local variable number of type long with some value and convert it to a String using the toString method. (Hint: Use Long.toString(long)).
long number = 134L;
String str = Long.toString(number);
System.out.println(str);
// Declare a method-local variable strNumber of type String with some value and convert it to a long value using the parseLong method. (Hint: Use Long.parseLong(String)).
String strNumber = "156";
long longNumber = Long.parseLong(strNumber);
System.out.println(longNumber);
//  Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. (Hint: parseLong method will throw a NumberFormatException).
String strNumber2 = "123abcd45b";
//long longNumber2 = Long.parseLong(strNumber2);
//System.out.println(longNumber);
//Declare a method-local variable number of type long with some value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(long)).
long longNumber3 = 177L;
Long numLong = Long.valueOf(longNumber3);
System.out.println(numLong);
// Declare a method-local variable strNumber of type String with some long value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(String)).
String strNumber4 = "1345";
Long longNumber4 = Long.valueOf(strNumber4);
System.out.println(longNumber4);
// Declare two long variables with values 1123 and 9845, and add them using a method from the Long class. (Hint: Use Long.sum(long, long)).
long number5 = 1123;
long number6 = 9845;
long add = Long.sum(number5,number6);
System.out.println(add);
// Declare two long variables with values 1122 and 5566, and find the minimum and maximum values using the Long class. (Hint: Use Long.min(long, long) and Long.max(long, long)).
System.out.println(Long.min(number5, number6));
System.out.println(Long.max(number5, number6));
// Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class. (Hint: Use Long.toBinaryString(long), Long.toOctalString(long), and Long.toHexString(long)).
long num = 7L;
String octString = Long.toOctalString(num);
String binString = Long.toBinaryString(num);
String hexString = Long.toHexString(num);
System.out.println(octString);
System.out.println(binString);
System.out.println(hexString);
// Experiment with converting a long value into other primitive types or vice versa and observe the results.



}  




}
