 // Working with java.lang.Short
 class prob3 {
    public static void main(String[] args) {
    // Write a program to test how many bytes are used to represent a short value using the BYTES field. (Hint: Use Short.BYTES).
    System.out.println(Short.BYTES);
    // Write a program to find the minimum and maximum values of short using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).
    System.out.println(Short.MIN_VALUE);
    System.out.println(Short.MAX_VALUE);
    // Declare a method-local variable number of type short with some value and convert it to a String using the toString method. (Hint: Use Short.toString(short)).
    short s = 1234;
    System.out.println(Short.toString(s));
    // Declare a method-local variable strNumber of type String with some value and convert it to a short value using the parseShort method. (Hint: Use Short.parseShort(String)).
    String strNumber = "4566";
    System.out.println(Short.parseShort(strNumber));
    // Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a short value. (Hint: parseShort method will throw a NumberFormatException).
    /*String str = "Ab12cd3";
    System.out.println(Short.parseShort(str)) */
    // Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(short)).
    short s1 = 4567;
    System.out.println(Short.valueOf(s1));
    // Declare a method-local variable strNumber of type String with some short value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(String)).
    String str2 = "1234";
    System.out.println(Short.valueOf(str2));
    
               
    }
}
