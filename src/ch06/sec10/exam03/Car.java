package ch06.sec10.exam03;

public class Car {
	//�ν��Ͻ� �ʵ� ����
	int speed;
	
	//�ν��Ͻ� �޼ҵ� ����
    void run() {
    	System.out.println(speed + "���� �޸��ϴ�.");//retun���� ����
    }
    
    static void simulate() {
    	//��ü ����
    	Car myCar = new Car();
    	//�ν��Ͻ� ��� ���
    	myCar.speed = 200;
    	myCar.run();
    }
    N
    public static void main(String[] args) {
    	//���� �޼ҵ� ȣ��
    	simulate();
    				
    	
    	
    	
    	
    	//��ü ����
    	Car myCar = new Car();
    	//�ν��Ͻ� ��� ���
    	myCar.speed = 60;
    	myCar.run();
    }
}
