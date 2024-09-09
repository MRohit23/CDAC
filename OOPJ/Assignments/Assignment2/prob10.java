 class prob10 {
public static void main(String[] args) {
    
    int num1 = Integer.parseInt(args[0]);
    System.out.println(num1);
    String opr = args[1];
    int num2 = Integer.parseInt(args[2]);
System.out.println(num2);

switch (opr) {
    case "+":
    System.out.println(num1+num2);
        
        break;
case "-":
System.out.println(num1-num2);
break;

case "*":
System.out.println(num1*num2);
break;
case "/":
System.out.println(num1/num2);
    default:
        break;
}


}    
}
