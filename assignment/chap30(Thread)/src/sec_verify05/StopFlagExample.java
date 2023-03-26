package sec_verify05;

import java.util.Scanner;

public class StopFlagExample {

	public static void main(String[] args) {
		ExecuteThread executeThread = new ExecuteThread();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇초후 종료 할까요 ?");
		int input = sc.nextInt();
		System.out.println(input+"초 후에 종료합니다.");
		
		executeThread.start();
		
		try {
			Thread.sleep((input*1000));
		} catch (InterruptedException e) {}
		
		sc.close();
		executeThread.setStop(true);
		

	}

}
