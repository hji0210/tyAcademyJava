package ch06.sec06.exam02;

public class Car {
  //필드 선언
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
      void printCarInfo(String who) {//return이 아니라 void로 선언
    	  System.out.println("======" + who + "=====");
    	  System.out.println("제조회사: " +this.company);
    	  System.out.println("모델명" + this.model);
    	  System.out.println("색깔" +  this.color);
    	  System.out.println("최대속도" +  this.maxSpeed);
      }
}	



	 
	 


