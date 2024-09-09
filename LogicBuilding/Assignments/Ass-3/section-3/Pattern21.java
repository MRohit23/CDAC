
/*

21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9

*/



class Pattern21{
	public static void main(String args[]){
		int n=0;
                  
                  for(int i=1;i<=5;i++){
                                for(int j=1;j<=i+n;j++){
									if(j%2==0){
                                 System.out.print("*");
									}else{
									System.out.print(j);
									}
                           }
						   n++;
						   System.out.println("");

              }
			  
	}
}


/*

int rows=9, i,j;
                  for(i=1;i<rows;i+=2)
                  {
                    System.out.println(i+"");
                                for(j=1;j<=i;j+=2)
                                {
                                 System.out.print(j+"*");
                                 }
                                 
                   }
                   System.out.print(i);
				   
				   
				   
				   */