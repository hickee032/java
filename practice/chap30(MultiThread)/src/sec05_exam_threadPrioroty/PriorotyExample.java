package sec05_exam_threadPrioroty;

public class PriorotyExample {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			Thread thread = new CalcThread("thread : " + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); //�켱������ 1 - ���� ����.
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY); //�켱������ 10 - ���� ����.
														 //�⺻ (����Ʈ)�� 5�̴�. 
			}
			thread.start();
		}
		/*
		 * �ƹ��� �켱������ 10���� �־��ٰ� �ؼ� ����ġ�� �󵵰� ���� ������ �� ���� �۾��� �����ٰ�� ���� �Ҽ� ����. 
		 * ������ �ڹٴ� ��ȯ �Ҵ� ���(Round-Robin)���� �����ϹǷ� CPU �����ٷ� ���¿����� �޶�����.
		 */
		
	}

}
