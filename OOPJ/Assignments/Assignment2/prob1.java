// Working with java.lang.Boolean

public class prob1 {
public static void main(String[] args) {
// Declare a method-local variable status of type boolean with the value true and convert it to a String using the toString method. (Hint: Use Boolean.toString(Boolean) ).
boolean b = true;
String str = Boolean.toString(b);
System.out.println(b);
//  Declare a method-local variable strStatus of type String with the value "true" and convert it to a boolean using the parseBoolean method. (Hint: Use Boolean.parseBoolean(String)).
String strStatus = "true";
boolean b1 = Boolean.parseBoolean(strStatus);
System.out.println(b1);
// Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt to convert it to a boolean. (Hint: parseBoolean method will not work as expected with "1" or "0").
//String str1 = "1";
// boolean b2 = Boolean.parseBoolean(str1);
// System.out.println(b2);
//  Declare a method-local variable status of type boolean with the value true and convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(boolean)).
boolean b3 = true;
Boolean b4 = Boolean.valueOf(b3);
System.out.println(b4);
// Declare a method-local variable strStatus of type String with the value "true" and convert it to the corresponding wrapper class using Boolean.valueOf(). (Hint: Use Boolean.valueOf(String)).
String strStatus1 = "true";
Boolean b5 = Boolean.valueOf(strStatus1);
System.out.println(b5); 


}    
}
