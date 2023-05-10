package TestVariable;

public class Testvariable {

    static {
    	System.out.println("static initializer");
 
    }
    
    String memberVariable = "member변수";
    
    Testvariable(){
    	    
    	System.out.println("생성자 호출");
    }
                                                         
    static void staticMethod(String argument) {
    	System.out.println(argument);
    }
    	
    	void memberMethod() {
    		String localVariable = "local변수";
    		System.out.println(localVariable);
    	}                                                                                                   
    	
    	public static void main(String[] args ) {
    		
    		System.out.println(Testvariable.staticVariable);
    		Testvariable.staticMethod("argument(매개)변수");
    		Testvariable tv = new Testvariable() ;
    		System.out.println(tv.memberVariable);
    		
    	}


	}


