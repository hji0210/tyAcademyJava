package com.tyfuture;

import TestVariable.Testvariable;

   public class TestVariable {
	static {
		System.out.println("static initializer");
	}
	{
		System.out.println("instatance initializer");
		
	}
	static String classVariable ="class����";
	
	 String memberVariable = "member����";
	
	TestVariable(){
		System.out.println("������ ȣ��");
		
	}
	
    static Void staticMethod(String argument){
	System.out.println(argument);
    }

     void memberMethod() {
    	 String localVariable ="local ����";
    		System.out.println(localVariable);
     }
     
     public static void main(String[]args) {
         System.out.println(Testvariable.classVariable);
         TestVariable.StudentMethod("argument(�Ű�)����");
         TestVariable tv = new TestVariable();
         System.out.println(tv.memberVariable);
    	 
     }

		
	}
	
	  
	
}
