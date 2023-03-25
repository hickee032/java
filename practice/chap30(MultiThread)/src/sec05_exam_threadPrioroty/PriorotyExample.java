package sec05_exam_threadPrioroty;

public class PriorotyExample {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			Thread thread = new CalcThread("thread : " + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); //우선순위가 1 - 가장 낮다.
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY); //우선순위가 10 - 가장 높다.
														 //기본 (디폴트)는 5이다. 
			}
			thread.start();
		}
		/*
		 * 아무리 우선순위를 10으로 주었다고 해서 끝마치는 빈도가 높을 뿐이지 꼭 먼저 작업을 끝낸다고는 보장 할수 없다. 
		 * 어차피 자바는 순환 할당 방식(Round-Robin)으로 실행하므로 CPU 스케줄러 상태에따라 달라진다.
		 */
		
	}

}
