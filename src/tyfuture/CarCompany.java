package tyfuture;

public class CarCompany {
	
	public static void main(String[] args) {
		
		Bus bus1 = new Bus ();
		Car bus2 = new Bus ();
		Bus bus3 = (Bus) bus2;
		System.out.println(bus1);		
		System.out.println(bus2);
		System.out.println(bus3.getSeat());
		
		int result = bus3.getSeat();//�Ű������� ���� 0
		bus2.setWheel(2);
		//���� �ٲ���, return���� ��� result�� �Ƚᵵ����
		
		bus1.setSeat(1);
		System.out.println(bus1.getSeat());
		System.out.println(bus1.getSpeed());
		
		
	}

}
