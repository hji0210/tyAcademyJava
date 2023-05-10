package ch03.sec09;

public class BitShifExample {

	public static void main(String[] args) {
		int value = 772; //[000000] [000000] [0000011] [00000100]
		
		//�������� 3byte(24bit) �̵��ϰ� �� 1����Ʈ�� ���� : [0000000]
		byte byte1 = (byte) (value >>>24);
		int int1 = byte1 & 225;
		System.out.println("ù ��° ����Ʈ ��ȣ ���� ��:" + int1);
		
		//�������� 2byte(16bit) �� 1����Ʈ�� ���� : [0000011]
		byte byte2 = (byte) (value >>>24);
		int int2 = byte1 & 225;
		System.out.println("ù ��° ����Ʈ ��ȣ ���� ��:" + int1);
		
		
		//�������� 1byte(8bit) �� 1����Ʈ�� ���� : [0000011]
		byte byte3 = (byte) (value >>>8);
		int int3 = byte3 & 225;
		System.out.println("�� ��° ����Ʈ ��ȣ ���� ��:" + int3);
		
		
		// �� 1����Ʈ�� ���� : [000000100]
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("�� ��° ����Ʈ ��ȣ ���� :" + int4);
		
		
	}

}
