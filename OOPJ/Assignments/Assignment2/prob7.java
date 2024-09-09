// * Working with java.lang.Double

public class prob7 {
    public static void main(String[] args) {
    // Write a program to test how many bytes are used to represent a double value using the BYTES field. (Hint: Use Double.BYTES).
    System.out.println(Double.BYTES);
    // Write a program to find the minimum and maximum values of double using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Double.MIN_VALUE and Double.MAX_VALUE).
    System.out.println(Double.MIN_VALUE);
    System.out.println(Double.MAX_VALUE);
    // Declare a method-local variable number of type double with some value and convert it to a String using the toString method. (Hint: Use Double.toString(double)).
    double doub = 45.55d;
    String doubstr = Double.toString(doub);
    // Declare a method-local variable strNumber of type String with some value and convert it to a double value using the parseDouble method. (Hint: Use Double.parseDouble(String)).
    String strNumber = "45.5";
    double doub2 = Double.parseDouble(strNumber);
    // Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a double value. (Hint: parseDouble method will throw a NumberFormatException).
    // double doub2 = Double.parseDouble(strNumber);
    // System.out.println(doub2); // will throw error;
    // Declare a method-local variable number of type double with some value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(double)).
    double doub3 = 123.07d;
    Double doub4 = Double.valueOf(doub3);
    System.out.println(doub4);
    // Declare a method-local variable strNumber of type String with some double value and convert it to the corresponding wrapper class using Double.valueOf(). (Hint: Use Double.valueOf(String)).
    String strNumbe2 = "1234.07";
    Double doub5 = Double.valueOf(strNumbe2);
    // Declare two double variables with values 112.3 and 984.5, and add them using a method from the Double class. (Hint: Use Double.sum(double, double)).
    double num1 = 100.5d;
    double num2 = 200.7d;
    double add = Double.sum(num1, num2);
    System.out.println(add);
    // Declare two double variables with values 112.2 and 556.6, and find the minimum and maximum values using the Double class. (Hint: Use Double.min(double, double) and Double.max(double, double)).
    System.out.println(Double.max(num1, num2));
    System.out.println(Double.min(num1, num2));
    // Declare a double variable with the value -25.0. Find the square root of this value. (Hint: Use Math.sqrt() method).
    double sqr = -25.0;
    System.out.println(Math.sqrt(sqr)); 
    // Declare two double variables with the same value, 0.0, and divide them. (Hint: Observe the result and any special floating-point behavior).
    double check1 = 0.0d;
    double check2 = 0.0d;
    double check3 = check1/check2;
    System.out.println(check3);
    // Experiment with converting a double value into other primitive types or vice versa and observe the results.








    }
}
