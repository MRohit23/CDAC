/*

Question 4: Discount Calculation 


Write a program to calculate the discount based on the total purchase amount. 

Use the following 
criteria: 

 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount.
Additionally, if the user has a membership card, increase the discount by 5%.
*/

class  DiscountCalculation 
{
  public static void main (String args[])
  {
	 int price=50;
	 double discount,total;
	 boolean membership= true;
	 
	 
	 if(price >=1000)
	 {
       if(membership==true){
	        discount=(price*25)/100;
	        System.out.println("discount is "+discount);
	        total=price-discount;
	        System.out.println("Amount to be Paid:"+total);
			
	   }else{
	        discount=(price*20)/100;
	        System.out.println("discount is "+discount);
	        total=price-discount;
	        System.out.println("Amount to be Paid:"+total);
	 }
	 }else if(price >=500 && price <=999)
	 {
		 if(membership==true){
	        discount=(price*15)/100;
	        System.out.println("discount is "+discount);
	        total=price-discount;
	        System.out.println("Amount to be Paid:"+total);
			
	   }else {
	        discount=(price*10)/100;
	        System.out.println("discount is "+discount);
	        total=price-discount;
	        System.out.println("Amount to be Paid:"+total);
	         }
	 }
	 else  
	 {
		  if(membership==true){
	        discount=(price*10)/100;
	        System.out.println("discount is "+discount);
	        total=price-discount;
	        System.out.println("Amount to be Paid:"+total);
			
	   }else {
	        discount=(price*5)/100;
	        System.out.println("discount is "+discount);
	        total=price-discount;
	        System.out.println("Amount to be Paid:"+total);
	        }
	
	 
  }
}
}

//discount is 5.0
//Amount to be Paid:45.0
