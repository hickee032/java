package sec_verify04_1;

public class Number {

	public synchronized void addNum() {
		
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("0~1000������ ���� ���մϴ�.");
		System.out.println(Thread.currentThread().getName()+"�� �� : "+sum);
		//System.out.println(sum);
		

	}

}
