 /*
  * Conversion between Primitive Types and Strings
Initialize a variable of each primitive type with a user-defined value and convert it into String:
o	First, use the toString method of the corresponding wrapper class. (e.g., Integer.toString()).
o	Then, use the valueOf method of the String class. (e.g., String.valueOf()).

  */
 
 class prob8 {
public static void main(String[] args) {
    boolean boolval = true;
    char charval = 'c';
    byte byteval = 10;
    short shortval = 20;
    int intval = 30;
    float floatval = 40.5f;
    double doubleval = 60.00d;
    long longval = 6000L;
    

    String boolstr = Boolean.toString(boolval);
    String charstr = Character.toString(charval);
    String bytestr = Byte.toString(byteval);
    String shortstr = Short.toString(shortval);
    String intstr = Integer.toString(intval);
    String floatstr = Float.toString(floatval);
    String doublestr = Double.toString(doubleval);
    String longstr = Long.toString(longval);
   

    String boolstr2 = String.valueOf(boolval);
    String charstr2 = String.valueOf(charval);
    String bytestr2 = String.valueOf(byteval);
    String shortstr2 = String.valueOf(shortval);
    String intstr2 = String.valueOf(intval);
    String floatstr2 = String.valueOf(floatval);
    String doublestr2 = String.valueOf(doubleval);
    String longstr2 = String.valueOf(longval);

    System.out.println(boolstr);
    System.out.println(boolstr2);
    System.out.println(bytestr);
    System.out.println(bytestr2);
    System.out.println(shortstr);
    System.out.println(shortstr2);
    System.out.println(intstr);
    System.out.println(intstr2);
    System.out.println(floatstr);
    System.out.println(floatstr2);
    System.out.println(doublestr);
    System.out.println(doublestr2);
    System.out.println(longstr);
    System.out.println(longstr2);



    
    
}    
}
