import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {
		
		long result = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제곱까지의 합을 계산합니다.");
		
		System.out.print("제곱하고 싶은 수를 입력 : ");
		
			int x = scan.nextInt();
			
			System.out.print("몇승을 할까요? : ");
			
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
	System.out.println(x+"의 " +y+"승 까지의 합계는 " +result);
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