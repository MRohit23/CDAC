class PassFailIf
{
 public static void main(String args[])
 {
  int c=41,cpp=90,java=60,count=0;
        

if (c > 40) {
            if(c>40){//c pass
        if (cpp > 40) {
                   if (c>40 || cpp>40){// c pass cpp pass  
                if (java > 40) { 
                            if(c>40 && cpp>40 || java>40){//c pass ,cpp pass ,java pass
                                System.out.println("all Pass");
							}
                            else{ // //c pass ,cpp pass ,java fail 
                                System.out.println("Fail in  java ");
								count++;
								System.out.println("fail count is :"+count);
								
							}
                        }
				   }
                    else{//c-pass,cpp-fail
                if (java > 40) {
                            if(c>40 || cpp>40 || java >40){//c pass cpp fail,java-pass
                                System.out.println("Fail in cpp");
								count++;
								System.out.println("fail count is :"+count);
							}
                            else { //c pass  cpp  fail  java fail 
                                System.out.println("Fail in cpp & java");
								count ++;
								System.out.println("fail count is :"+count);
							}
                        }
					}
                }
			}
            else{//c - fail
        if (cpp > 40) {
                    if(c>40 ||cpp>40){ //c fail cpp pass 
                if (java > 40) {
                            if(c>40||cpp>40||java>40){// c fail cpp pass java pass 
                                System.out.println("Fail inn c");
								count ++;
								System.out.println("fail count is :"+count);
							}
                            else  {//c fail cpp pass java fail 
                                System.out.println("Fail in c & java");
								count ++;
								System.out.println("fail count is :"+count);
							}
                        }
					}
                    else{ //c fail cpp fail 
                if (java > 40) {
                            if(c>40 || cpp>40 ||java>40){ //c fail cpp fail java pass 
                                System.out.println("Fail in c & cpp");
								count ++;
								System.out.println("fail count is :"+count);
				}
                            else  {//c fail cpp fail java fail 
                                System.out.println(" fail in c , cpp , java");
								count ++;
								System.out.println("fail count is :"+count);
							}
                        }
					}
                }
			}
        }
		//System.out.println("fail count is :"+count);
    }
}

		