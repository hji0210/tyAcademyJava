package work_01;

public class RegisterCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cus1=new Customer("abc",1234,"������");
		Customer cus2=new Customer("qwe",1234,"�Ѽ���",010-1234-5678,"������");
	    cus1.tel=010-7894-1234;
	
	    //void?
       System.out.println(cus1);
       System.out.println(cus2);
       System.out.println(cus1.id);
       
	}

}
