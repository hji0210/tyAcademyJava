package TestVariable;

public class Testvariable {

    static {
    	System.out.println("static initializer");
 
    }
    
    String memberVariable = "member����";
    
    Testvariable(){
    	    
    	System.out.println("������ ȣ��");
    }
                                                         
    static void staticMethod(String argument) {
    	System.out.println(argument);
    }
    	
    	void memberMethod() {
    		String localVariable = "local����";
    		System.out.println(localVariable);
    	}                                                                                                   
    	
    	public static void main(String[] args ) {
    		
    		System.out.println(Testvariable.staticVariable);
    		Testvariable.staticMethod("argument(�Ű�)����");
    		Testvariable tv = new Testvariable() ;
    		System.out.println(tv.memberVariable);
    		
    	}


	}


