package Test;
import java.util.Scanner;
class sum
public class TestFuncCLAtion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		Sum tf = new Sum();
		int sum =tf.sumToNum(num);
		
		System.out.println(num+"까지의 합: " + sum);

	}

}
