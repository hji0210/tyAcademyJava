package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car��ü ����
		Car mycar = new Car();
		
		//���ϰ��� ���� setGas()�޼ҵ� ȣ��
		mycar.setGas(5);
		
		//isLeftGas()�޼ҵ带 ȣ���ؼ� ���ϰ��� true�� ��� if ��� ����
	    if(mycar.isLeftGas()) {
	    	System.out.println("����մϴ�.");
	    	
	    	//���ϰ��� ���� run()�޼ҵ� ȣ��
	    	  mycar.run();
	    	  
	    }
	    
	    System.out.println("gas�� �����ϼ���.");

	}

}
