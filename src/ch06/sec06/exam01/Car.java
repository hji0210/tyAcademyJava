package ch06.sec06.exam01;

public class Car {
  //�ʵ� ����
    String model;
    boolean start;
    int speed;
	

   public static void main(String[] args) {
	   //car ��ü ����
	  Car myCar = new Car();
	  
	  //Car ��ü�� �ʵ尪 �б�
	  System.out.println("�𵨸�: " + myCar.model);
	  System.out.println("�õ�����: " + myCar.start);
	  System.out.println("����ӵ�: " + myCar.speed);
   }
}


