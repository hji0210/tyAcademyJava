package ch06.sec08.exam03;

public class Car {
	//�ʵ� ����
	int gas;
	
	//���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas�ʵ尪�� ����
	 void setGas(int gas) {
		 this.gas = gas;
		 
	 }
	 
	 //���ϰ��� boolean�� �޼ҵ��� gas�ʵ尪�� 0�ƴϸ� false��,0�� �ƴϸ� true�� ����
	 boolean isLeftGas() {
		 if(gas ==0) {
			 System.out.println("gas�� �����ϴ�.");
			 return false;//false�� �����ϰ� �޼ҵ� ����
			}
		 System.out.println("gas�� �ֽ��ϴ�");
		 return true;//true�� �����ϰ� �޼ҵ� ����
		 
	 }
	 
	 //���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�ƴϸ� return ������ �޼ҵ带 ����
	 void run() {
		 while(true) {
			 if(gas>0) {
				 System.out.println("�޸��ϴ�.(gas�ܷ�: " + gas + ")");
				 gas -= 1;
			 }else {
				 System.out.println("����ϴ�.(gas�ܷ�:"  + gas + ")");
				 	return;//�޼ҵ� ����
				 
				 
			 }
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car��ü ����
		Car mycar = new Car();
		
		//���ϰ��� ���� setGas()�޼ҵ� ȣ��
		mycar.setGas(5);
		
		//isLeftGas()�޼ҵ带 ȣ���ؼ� ���ϰ��� true�� ��� if ��� ����
	    if(mycar.isLestGas()) {
	    	System.out.println("����մϴ�.");
	    	
	    	//���ϰ��� ���� run()�޼ҵ� ȣ��
	    	  myCar.run();
	    	  
	    }
	    
	    System.out.println("gas�� �����ϼ���.");
	
	}

}
