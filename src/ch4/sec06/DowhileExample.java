package ch4.sec06;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
	
		System.out.println("�޽����� �Է��Ͻÿ�.");
		System.out.println("���α׷��� �����϶�� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));																																																					
		
		System.out.println();
		System.out.println("���α׷� ����");

	}

}
