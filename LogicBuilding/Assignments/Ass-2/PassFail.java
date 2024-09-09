/*

Question 5: Student Pass/Fail Status with Nested Switch 

Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in.

*/

class PassFail
{
 public static void main(String args[])
 {
  int c=41,cpp=50,java=60,count=0;
        

        switch (c > 40) {
            case true://c pass
                switch (cpp > 40) {
                    case true:// c pass cpp pass  
                        switch (java > 40) { 
                            case true://c pass ,cpp pass ,java pass
                                System.out.println("Pass");
                                break;
                            case false:// //c pass ,cpp pass ,java fail 
                                System.out.println("Fail in  java ");
								count++;
                                break;
                        }
                        break;
                    case false://c-pass,cpp-fail
                        switch (java > 40) {
                            case true://c pass cpp fail,java-pass
                                System.out.println("Fail in cpp");
								count++;
                                break;
                            case false: //c pass  cpp  fail  java fail 
                                System.out.println("Fail in cpp & java");
								count ++;
                                break;
                        }
                        break;
                }
                break;
            case false://c - fail
                switch (cpp > 40) {
                    case true:  //c fail cpp pass 
                        switch (java > 40) {
                            case true:// c fail cpp pass java pass 
                                System.out.println("Fail inn c");
								count ++;
                                break;
                            case false: //c fail cpp pass java fail 
                                System.out.println("Fail in c & java");
								count ++;
                                break;
                        }
                        break;
                    case false://c fail cpp fail 
                        switch (java > 40) {
                            case true: //c fail cpp fail java pass 
                                System.out.println("Fail in c & cpp");
								count ++;
                                break;
                            case false: //c fail cpp fail java fail 
                                System.out.println(" fail in c , cpp , java");
								count ++;
                                break;
                        }
                        break;
                }
                break;
        }
    }
}

						 
						 
					    
  
 
  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
/*	  
	 





 if(c>=40 && cpp>=40 && java>=40){
	  
	  System.out.println("Pass");
  }
  else {
	  System.out.println("fail");
	  count =count+1;
  }








	 
public class Main {
    public static void main(String[] args) {
        int sub1 = 50; // predefined marks for subject 1
        int sub2 = 30; // predefined marks for subject 2
        int sub3 = 40; // predefined marks for subject 3

        switch (sub1 > 40) {
            case true:
                switch (sub2 > 40) {
                    case true:
                        switch (sub3 > 40) {
                            case true:
                                System.out.println("Pass");
                                break;
                            case false:
                                System.out.println("Fail in 1 subject");
                                break;
                        }
                        break;
                    case false:
                        switch (sub3 > 40) {
                            case true:
                                System.out.println("Fail in 1 subject");
                                break;
                            case false:
                                System.out.println("Fail in 2 subjects");
                                break;
                        }
                        break;
                }
                break;
            case false:
                switch (sub2 > 40) {
                    case true:
                        switch (sub3 > 40) {
                            case true:
                                System.out.println("Fail in 1 subject");
                                break;
                            case false:
                                System.out.println("Fail in 2 subjects");
                                break;
                        }
                        break;
                    case false:
                        switch (sub3 > 40) {
                            case true:
                                System.out.println("Fail in 2 subjects");
                                break;
                            case false:
                                System.out.println("Fail in 3 subjects");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}



*/