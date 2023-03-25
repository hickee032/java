package sec09_exam_Thread_Join;

public class JoinExample {

	public static void main(String[] args) {

		double avg = 0.0;
		long total = 0L;

		SumThread sum = new SumThread();
		sum.start();
		
		//sumThread의 run()가 끝나지 않았을때 getsum()을 호출 하면 1~10000까지의 합이 나오리란 보장이 없다.
		//그래서 sumThread가 끝날때까지 기다려주는 코드가 필요하다.그게 바로 join()이다.
		
		try {
			sum.join(); //mainThread는 sumThread가 끝날 때 까지 기다린다.
		} catch (InterruptedException e) {
		}

		total = sum.getSum();
		avg = (double)total/10000;
		System.out.println("1~10000까지의 합 : " + sum.getSum());
		System.out.println("1~10000까지의 합의 평균 : " + avg);

	}

}
