package sec09_exam_Thread_Join;

public class JoinExample {

	public static void main(String[] args) {

		double avg = 0.0;
		long total = 0L;

		SumThread sum = new SumThread();
		sum.start();
		
		//sumThread�� run()�� ������ �ʾ����� getsum()�� ȣ�� �ϸ� 1~10000������ ���� �������� ������ ����.
		//�׷��� sumThread�� ���������� ��ٷ��ִ� �ڵ尡 �ʿ��ϴ�.�װ� �ٷ� join()�̴�.
		
		try {
			sum.join(); //mainThread�� sumThread�� ���� �� ���� ��ٸ���.
		} catch (InterruptedException e) {
		}

		total = sum.getSum();
		avg = (double)total/10000;
		System.out.println("1~10000������ �� : " + sum.getSum());
		System.out.println("1~10000������ ���� ��� : " + avg);

	}

}
