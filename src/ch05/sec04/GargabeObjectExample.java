package ch05.sec04;

public class GargabeObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hobby = "여행";
		hobby = null;; //"여행"에 해당하는 String 객체를 쓰레기를 만듦

		String kind1 ="자동차";
		String kind2 = kind1; //kind 변수에 저장되어 있는 번지를 kind2변수에 대입
		kind1= null;
		System.out.println(hobby);
		System.out.println("kind2: " + kind2);
	}
                                                                                                           
}
