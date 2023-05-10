package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //객체 생성시 주민등록번호 이름 전달
		Korean k1 = new Korean("123456-1234567" , "김자바");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//Final 필드는 값을변경할 수 있음
		//k1.nation = "USA"
		//K1.SSN = "123-12-1234";
		
		//비 FINAL 필드는 값 변경 가능
		k1.name="박자바";//final String nation = "대한민국";
		                //final String ssn;변경 불가
		
	}

}
