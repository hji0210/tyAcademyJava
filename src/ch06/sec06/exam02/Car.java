package ch06.sec06.exam02;

public class Car {
  //�ʵ� ����
	String company; 
	String model; 
	String color;
	 int maxSpeed;
	 
      Car(String company, String model, String color, int maxSpeed){
    	  this.company = company;
    	  this.model = model;
    	  this.color = color;
    	  this.maxSpeed = maxSpeed;
      }
      void printCarInfo(String who) {//return�� �ƴ϶� void�� ����
    	  System.out.println("======" + who + "=====");
    	  System.out.println("����ȸ��: " +this.company);
    	  System.out.println("�𵨸�" + this.model);
    	  System.out.println("����" +  this.color);
    	  System.out.println("�ִ�ӵ�" +  this.maxSpeed);
      }
}	



	 
	 


