
class Q20{
	public static void main(String args[]){
		int n=5;
		for(int i=5;i>0;i--){
			for(int j=5;j>=i;j--){
				if(j==5)
					System.out.print(j);
				else
					System.out.print("*"+j);
			}System.out.println();
		}
	}
}