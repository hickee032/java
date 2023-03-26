package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("입력하신 사이의 정수의 합을 구합니다");

		System.out.print("첫 번째 정수 : ");
		int x = sc.nextInt();

		System.out.print("두 번째 정수 : ");
		int y = sc.nextInt();

//		if (x != 1) {
//			sum = (1 + y) * y / 2 - (1 + x - 1) * (x - 1) / 2;
//		} else {
//			sum = (1 + y) * y / 2;
//		}

		for (int i = x; i <= y; i++) {
			sum +=i;	
		}
		
		

		System.out.println("[작업처리 결과] : " + sum);
		
		sc.close();
	
		return sum;
	}

}
