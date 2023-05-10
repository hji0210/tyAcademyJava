package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Car 객체 생성
		Car myCar = new Car("현대자동차","그랜저","검정",350);
		myCar.printCarInfo("내차");
		Car yourCar = new Car("포로쉐", "GV80","검정",500 );
		myCar.printCarInfo("너차");
		
		
		//Car 객체의 필드값 읽기
	}
}	
