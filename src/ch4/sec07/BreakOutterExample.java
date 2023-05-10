package ch4.sec07;

public class BreakOutterExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Outter : for(char upper=A; upper<='Z'; upper++) {
			for(char lower ='a'; lower<='z'; lower++)
             System.out.println(upper + "-" + lower);
		if(lower=='g') {
			break Outter;
		}
	}

  }

     system.out.println("프로그램 실행 종료")
     }
     }