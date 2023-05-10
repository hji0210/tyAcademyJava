package tyfuture;//은닉이 적용된 예제

public class Car {

     static String company = "포로쉐";//하늘
     private int wheel = 0;
     private int speed = 1;
     
     Car() {
    	 System.out.println("Car생성자호출");
     }


	public void setWheel(int wheel) {
		this.wheel = wheel;
	  }
	
	 public void setSpeed(int speed) {
		this.speed = speed;
	  }
	 public int getWheel() {
		 return wheel;
	 }
	 public int getSpeed() {
		 return speed;
    }
    
    public String toString() {
    return "차(Car)";
    }
 }

