package ch06.sec08.exam01;

public class Computer {
	//�������� �Ű������� ���� �޼ҵ� ����
	int sum(int ...values) {
		//sum ���� ����
		int sum=0;
		
		//values�� �迭 Ÿ���� ����ó�� ���
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		
		// �ջ� ����� ����
	 return sum;
	}

}
