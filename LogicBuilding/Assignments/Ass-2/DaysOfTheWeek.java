
/*
Question 2: Days of the Week 

Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 

*/



class DaysOfTheWeek
{
	
	public static void main (String args[]){
		
		int Day=5;
	
			switch(Day)
			{
				
				case 1:
					System.out.println("Monday");
					System.out.println("weekday");
					break;
				
				case 2:
					System.out.println("Tuesdayday");
					System.out.println("weekday");
					break;
					
				case 3:
					System.out.println("Wednesday");
					System.out.println("weekday");
					break;
					
				case 4:
					System.out.println("Thursday");
					System.out.println("weekday");
					break;
					
				case 5:
					System.out.println("Friday");
					System.out.println("weekday");
					break;
					
				case 6:
					System.out.println("Saturday");
					System.out.println("weekend");
					break;
					
				case 7:
					System.out.println("Sunday");
					System.out.println("weekend");
					break;
					
				default:
					System.out.println("ohhhh.... only 7 Days  in week ");
					break;
			}
	     }
	}

