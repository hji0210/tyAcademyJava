package ch06.sec10.exam02;

public class ClassName {
	//�ν��Ͻ��� �ʵ�� �޼ҵ� ����
	int field1;
	void method1() {...}
	
	//���� �ʵ�� �޼ҵ� ����
	static  int field2;
	static void method2() {..}
	
	//���� ��� ����
	static {
		field1 =10;
	    method1();
	    field2 = 10;
	    method2();
	    
	    //���� �޼ҵ� ����
	    static void method3() {
	    	this.field1 = 10;
	    	this.method1();
	    	field2 = 10;
	    	method(2);
	    }
	    
	}
	
	

}
