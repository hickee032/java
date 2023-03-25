package sec06_exam_thread_unsynchcronized;

//공유객체
public class Calculator {
	private int memory;
	int value = 100;

	public int getMemory() {
		return memory;
	}

	// 비동기화 메서드 -->동기화로 만들어 줘야 데이터의 신뢰성이 보장된다. --> synchronized
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		// 2초간 일시정지 (TIMED_WAITING)
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		//// 현재 실행중인 스레드 이름과 memory값 출력
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	//비동기화 메서드 
	public void print() {
		System.out.println(Thread.currentThread().getName()+" value값 :" + this.value);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
