package com.tyfuture;

import TestVariable.Testvariable;

   public class TestVariable {
	static {
		System.out.println("static initializer");
	}
	{
		System.out.println("instatance initializer");
		
	}
	static String classVariable ="class변수";
	
	 String memberVariable = "member변수";
	
	TestVariable(){
		System.out.println("생성자 호출");
		
	}
	
    static Void staticMethod(String argument){
	System.out.println(argument);
    }

     void memberMethod() {
    	 String localVariable ="local 변수";
    		System.out.println(localVariable);
     }
     
     public static void main(String[]args) {
         System.out.println(Testvariable.classVariable);
         TestVariable.StudentMethod("argument(매개)변수");
         TestVariable tv = new TestVariable();
         System.out.println(tv.memberVariable);
    	 
     }

		
	}
	
	  
	
}
