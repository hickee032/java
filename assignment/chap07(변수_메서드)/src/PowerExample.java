import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {
		
		long result = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������� ���� ����մϴ�.");
		
		System.out.print("�����ϰ� ���� ���� �Է� : ");
		
			int x = scan.nextInt();
			
			System.out.print("����� �ұ��? : ");
			
			int y = scan.nextInt();
			
		//	long result = PowerExample.power1(x, y);
			
			
			
			//scan.close();	


//	public static long power(int x, int n) {
//		long result = 1;
//		long sum = 0;
//		
//		for(int i = 0 ; i<=n-1 ; i++) {
//			result *= x;
//			
//			sum+=result;
//			//System.out.println(result);
//		}
//		//System.out.println(sum);
//		return sum;
//	}
	for(int i = 1 ; i<=y ; i++) {
		result += power1(x,i);
	}
	System.out.println(x+"�� " +y+"�� ������ �հ�� " +result);
}
	
	public static long power1(int x, int n) {
		long result =0;
		//long sum = 0;
		if(n==1) {
			result = x;
		}
		else {
			
			result = x*power1(x,n-1);
			
			//sum+=result;
		}
		return result;}
	
}
//x*x