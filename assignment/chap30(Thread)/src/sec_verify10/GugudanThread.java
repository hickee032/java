package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for (int i = 0; i <=9; i++) {
			System.out.println(input + "*" + i + "=" + input * i);
			System.out.println(Thread.currentThread().getName());
		}
		
//		System.out.println(Thread.currentThread().getName());

		System.out.println("[구구단을 종료합니다.]");

		sc.close();

	}

}
