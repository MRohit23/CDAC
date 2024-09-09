// Working with java.lang.Byte
class prob2 {
public static void main(String[] args) {
    
// Write a program to test how many bytes are used to represent a byte value using the BYTES field. (Hint: Use Byte.BYTES).
System.out.println(Byte.BYTES);
// Write a program to find the minimum and maximum values of byte using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);
// Declare a method-local variable number of type byte with some value and convert it to a String using the toString method. (Hint: Use Byte.toString(byte)).
byte b = 10;
System.out.println(Byte.toString(b));
// Declare a method-local variable strNumber of type String with some value and convert it to a byte value using the parseByte method. (Hint: Use Byte.parseByte(String)).
String strNumber = "110";
System.out.println(Byte.parseByte(strNumber));
// Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. (Hint: parseByte method will throw a NumberFormatException).
// String strNumber = "Ab12Cd3";
// System.out.println(Byte.parseByte(strNumber));
// Declare a method-local variable number of type byte with some value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(byte)).
byte b1 = 12;
System.out.println(Byte.valueOf(b));
// Declare a method-local variable strNumber of type String with some byte value and convert it to the corresponding wrapper class using Byte.valueOf(). (Hint: Use Byte.valueOf(String)).
String strNumber1 = "120";
System.out.println(Byte.valueOf(strNumber1)); 

}    
}
