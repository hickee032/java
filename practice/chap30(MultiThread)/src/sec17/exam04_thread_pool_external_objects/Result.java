package sec17.exam04_thread_pool_external_objects;

//공유 객체
//submit(runnable, V result) 사용하기 위한 공유 객체
public class Result {

	int accumValue;

	// 공유객체이기 때문에 동기화가 필수이다. synchronized --> 신뢰성
	public synchronized void addValue(int value) {
		this.accumValue += value;

	}

	public synchronized int getValue() {
		return this.accumValue;

	}

}
