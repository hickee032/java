package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("�Է��Ͻ� ������ ������ ���� ���մϴ�");

		System.out.print("ù ��° ���� : ");
		int x = sc.nextInt();

		System.out.print("�� ��° ���� : ");
		int y = sc.nextInt();

//		if (x != 1) {
//			sum = (1 + y) * y / 2 - (1 + x - 1) * (x - 1) / 2;
//		} else {
//			sum = (1 + y) * y / 2;
//		}

		for (int i = x; i <= y; i++) {
			sum +=i;	
		}
		
		

		System.out.println("[�۾�ó�� ���] : " + sum);
		
		sc.close();
	
		return sum;
	}

}
