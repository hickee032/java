package sec_verify05;

import java.util.Scanner;

public class StopFlagExample {

	public static void main(String[] args) {
		ExecuteThread executeThread = new ExecuteThread();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �ұ�� ?");
		int input = sc.nextInt();
		System.out.println(input+"�� �Ŀ� �����մϴ�.");
		
		executeThread.start();
		
		try {
			Thread.sleep((input*1000));
		} catch (InterruptedException e) {}
		
		sc.close();
		executeThread.setStop(true);
		

	}

}
