class FailPass{
	public static void main(String[] args){
		int c=10,cpp=20,java=50,count=0;
		if(c>40){
			count+=1;
		}
		if(cpp>40){
			count+=1;
		}
		if(java>40){
			count+=1;
		}
		
		if(count==3){
		 System.out.println("passed in all 3 subjects");
		}else if(count==2){
			System.out.println("failed in all 1 subjects");
		}else if(count==1){
			System.out.println("failed in all 2 subjects");
		}
		else{
			System.out.println("failed in all  subjects");
		}
			
	}
}